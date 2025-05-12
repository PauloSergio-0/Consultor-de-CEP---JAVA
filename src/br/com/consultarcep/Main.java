package br.com.consultarcep;

import br.com.consultarcep.service.Menu;
import br.com.consultarcep.service.ViaCepApi;

import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu menu = new Menu();
        menu.menu();
    }
}
