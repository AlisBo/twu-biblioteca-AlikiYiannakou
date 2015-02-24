package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        //System.out.println("Welcome to Biblioteca!");

        BibliotecaApp biblioteca= new BibliotecaApp();
        biblioteca.run();
    }

    public String run(){
        String welcomeMessage = "Welcome to Biblioteca!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }
}
