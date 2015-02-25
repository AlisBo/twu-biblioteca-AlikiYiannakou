package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class BibliotecaApp {

    public static void main(String[] args) {
        //System.out.println("Welcome to Biblioteca!");

        BibliotecaApp biblioteca= new BibliotecaApp();
        biblioteca.run();

        Map<Book,Boolean> listOfBooks=new HashMap<Book, Boolean>();
        ListOfBooks list=new ListOfBooks();
        Book book=new Book();
        book.setTitle("Book1");
        book.setCode(1);
        book.setAuthor("Author1");
        book.setYearOfPublication(1990);
        listOfBooks.put(book,true);

        book=new Book();
        book.setTitle("Book2");
        book.setCode(2);
        book.setAuthor("Author2");
        book.setYearOfPublication(1992);
        listOfBooks.put(book,true);

        book=new Book();
        book.setTitle("Book3");
        book.setCode(3);
        book.setAuthor("Author3");
        book.setYearOfPublication(1993);
        listOfBooks.put(book,true);

        book=new Book();
        book.setTitle("Book4");
        book.setCode(4);
        book.setAuthor("Author4");
        book.setYearOfPublication(1994);
        listOfBooks.put(book,true);

        book=new Book();
        book.setTitle("Book5");
        book.setCode(5);
        book.setAuthor("Author5");
        book.setYearOfPublication(1995);
        listOfBooks.put(book,true);
        list.setList(listOfBooks);
        System.out.print(list.getList().get(book));
    }

    public String run(){
        String welcomeMessage = "Welcome to Biblioteca!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }



}
