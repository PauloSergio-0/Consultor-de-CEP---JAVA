package br.com.consultarcep;

import br.com.consultarcep.service.ViaCepApi;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ViaCepApi viaCepApi = new ViaCepApi();

        viaCepApi.conexaoViaCep();
    }
}
