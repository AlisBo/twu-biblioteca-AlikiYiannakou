package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BibliotecaApp {

    public static void main(String[] args) {

        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.run();
    }
        //Map<Book,Boolean> listOfBooks=new HashMap<Book, Boolean>();
        //ListOfBooks list=new ListOfBooks();
        //getLibrary(listOfBooks, list);
    public ArrayList<Book> getListOfBooks(){
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        for(int i=0;i<10;i++){
            Book book=new Book();
            book.setTitle("Book"+i);
            book.setCode(1);
            book.setAuthor("Author"+i);
            book.setYearOfPublication(1990+i);
            book.setIsAvailable(true);
            listOfBooks.add(book);
        }
        return listOfBooks;
    }


    public String run(){
        String welcomeMessage = "Welcome to Biblioteca!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }



}
