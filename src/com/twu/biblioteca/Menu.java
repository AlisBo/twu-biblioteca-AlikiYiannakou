package com.twu.biblioteca;

import com.twu.action.BibliotecaServicesForBooks;
import com.twu.action.BibliotecaServicesForMovies;
import com.twu.action.LogIn;
import com.twu.entities.ListOfBooks;
import com.twu.entities.ListOfMovies;
import com.twu.tools.ReadFromConsole;

/**
 * Created by ayiannak on 05/03/2015.
 */

public class Menu {
    private ReadFromConsole userInput = new ReadFromConsole();
    private BibliotecaServicesForBooks bookServices;
    private BibliotecaServicesForMovies movieServices;
    private ListOfBooks listOfBooks;
    private ListOfMovies listOfMovies;
    private LogIn logIn;

    public Menu() {
        listOfBooks = new ListOfBooks();
        listOfMovies = new ListOfMovies();
        bookServices = new BibliotecaServicesForBooks(listOfBooks);
        movieServices = new BibliotecaServicesForMovies(listOfMovies);
        logIn = new LogIn();
    }

    public void mainMenu() {

        System.out.println("Main Menu:Select from the Options Below");
        System.out.println("1-List Of Books");
        System.out.println("2-Check out a book");
        System.out.println("3-Return a book");
        System.out.println("4-List Of Movies");
        System.out.println("5-Check out a movie");
        System.out.println("6-Return a movie");
        System.out.println("0-Quit");
        int choice;
        try {
            choice = Integer.parseInt(userInput.read());
            getMenuOption(choice);
        } catch (NumberFormatException ex) {
            getMenuOption(99999);

        }
    }

    public void getMenuOption(int choice) {
        String message1="Give the code of the book";
        String message2="Give the code of the movie";
        switch (choice) {
            case 1: listOfBooks.printList();
                break;
            case 2: do {
                    System.out.println(message1);
            }while(bookServices.checkOutABook(userInput.read()) == 0);
                break;
            case 3: do {
                    System.out.println(message1);
            }while(bookServices.returnABook(userInput.read()) == 0);
                break;
            case 4: listOfMovies.printList();
                break;
            case 5: do{
                System.out.println(message2);
            }while(movieServices.checkOutAMovie(userInput.read())==0);
                break;
            case 6: do{
                System.out.println(message2);
            }while(movieServices.returnAMovie(userInput.read())==0);
                break;
            case 0:
                logIn.quit();
                break;
            default:
                System.out.println("Select a valid option!");
                break;

        }
    }
}
