package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {

        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.run();
        biblioteca.getMenuOption();

    }
    //Map<Book,Boolean> listOfBooks=new HashMap<Book, Boolean>();
    //ListOfBooks list=new ListOfBooks();
    //getLibrary(listOfBooks, list);
    public int getMenuOption(){
        System.out.println("Main Menu:Select from the Options Below");
        System.out.println("1-List Of Books");
        int choice;
        Scanner keyboard = new Scanner(System.in);
        choice=keyboard.nextInt();
        mainMenu(choice);
        return choice;
    }

    public void mainMenu(int choice){
        switch (choice){
            case 1: getListOfBooks();
                break;
            default:System.out.println("Select a valid option!");
                getMenuOption();
                break;

        }
    }

    public ArrayList<Book> getListOfBooks(){
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        for(int i=0;i<10;i++){
            Book book=new Book();
            book.setTitle("Book"+i);
            book.setCode(i+1);
            book.setAuthor("Author"+i);
            book.setYearOfPublication(1990+i);
            book.setIsAvailable(true);
            listOfBooks.add(book);
        }
        printList(listOfBooks);
        return listOfBooks;
    }

    public void printList(ArrayList<Book> list){
        System.out.println("Code:   Author:   Title:  Publication Year:");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIsAvailable()) {
                System.out.println(list.get(i).getCode()+"      "+list.get(i).getAuthor()+"    "+list.get(i).getTitle()+"      "+list.get(i).getYearOfPublication());
            }
        }
    }

    public String run(){
        String welcomeMessage = "Welcome to Biblioteca!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }



}
