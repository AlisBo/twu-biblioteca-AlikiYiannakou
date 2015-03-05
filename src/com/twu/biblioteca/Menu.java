package com.twu.biblioteca;

import com.twu.action.BibliotecaServicesForBooks;
import com.twu.action.LogIn;
import com.twu.entities.ListOfBooks;
import com.twu.entities.ListOfMovies;
import com.twu.tools.ReadFromConsole;

/**
 * Created by ayiannak on 05/03/2015.
 */

public class Menu {
    private ReadFromConsole userInput=new ReadFromConsole(); ;
    private BibliotecaServicesForBooks bookServices;
    private ListOfBooks listOfBooks;
    private ListOfMovies listOfMovies;
    private LogIn logIn;

    public Menu(){
        listOfBooks=new ListOfBooks();
        listOfMovies=new ListOfMovies();
        logIn=new LogIn();
    }

    public void mainMenu(){

            System.out.println("Main Menu:Select from the Options Below");
            System.out.println("1-List Of Books");
            System.out.println("2-Check out a book");
            System.out.println("3-Return a book");
            System.out.println("0-Quit");
            int choice;
            try {
                choice = Integer.parseInt(userInput.read());
                getMenuOption(choice);
            } catch (NumberFormatException ex) {
                getMenuOption(99999);

            }
    }

    public void getMenuOption(int choice){
        switch (choice){
            case 1: listOfBooks.printList();
                break;
            case 2:System.out.println("Give the code of the book");
                System.out.print(bookServices.checkOutABook("1"));
          // }while( bookServices.checkOutABook(userInput.read())==0);
                break;
            case 3:do {System.out.println("Give the code of the book");
            }while(bookServices.returnABook(userInput.read())==0);
                break;
            case 0: logIn.quit();
                break;
            default:System.out.println("Select a valid option!");
                break;

        }
    }
}
