package br.com.consultarcep.service;

import br.com.consultarcep.model.ViaCepJson;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;
import java.util.Scanner;

public class ViaCepApi {
    private final Scanner  scanner = new Scanner(System.in).useLocale(Locale.US);


    public void conexaoViaCep() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String cep = buscarCep();

        String urlApi = "https://viacep.com.br/ws/"+ cep + "/json/";

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlApi)).build();

        HttpResponse<String > response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

            ViaCepJson cepApi = gson.fromJson(json, ViaCepJson.class);

        System.out.println("Esse é o endereco retornado: "+ cepApi);

    }


    private String buscarCep(){

        String cep = "";

        while (true){

            System.out.println("Informe umn cep: ");
            cep = scanner.nextLine();

            if( cep.length() == 8 && cep.matches("\\d+") ){
                break;

            } else {
                System.out.println("Cep invalido");
                System.out.println("Cep deve conter apenas 8 numeros.");
            }

        }
        return cep;
    }



}
