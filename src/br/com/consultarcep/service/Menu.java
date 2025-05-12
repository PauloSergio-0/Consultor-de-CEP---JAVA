package br.com.consultarcep.service;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    private  final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void menu() throws IOException, InterruptedException {
        ViaCepApi viaCepApi = new ViaCepApi();


        while (true){
            System.out.println("1. pesquisar cep");
            System.out.println("0. sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1){
                viaCepApi.conexaoViaCep();
            } else if (opcao==0) {
                break;
            }else {
                System.out.println("opção invalida");
            }
        }
    }
}
