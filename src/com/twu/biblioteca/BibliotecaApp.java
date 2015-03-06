package com.twu.biblioteca;

/**
 * Created by AlisProf on 24/2/2015.
 */
public class BibliotecaApp {


    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.run();
    }

    public void run() {
        System.out.println("Welcome to Biblioteca!");
        Menu menu = new Menu();
        while (true) {
            menu.mainMenu();
        }
    }


}
