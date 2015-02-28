package com.twu.biblioteca;

        import com.twu.tools.ReadFromConsole;

public class BibliotecaApp {
    ListOfBooks listOfBooks= new ListOfBooks();
    ReadFromConsole userInput =new ReadFromConsole();

    public static void main(String[] args) {

        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.run();

    }

    public String run(){
        String welcomeMessage = "Welcome to Biblioteca!";
        System.out.println(welcomeMessage);
        mainMenu();
        return welcomeMessage;
    }
    public void mainMenu(){
        System.out.println("Main Menu:Select from the Options Below");
        System.out.println("1-List Of Books");
        System.out.println("2-Check out a book");
        System.out.println("3-Return a book");
        System.out.println("0-Quit");
        int choice;
        try {
            choice= Integer.parseInt(userInput.read());
            getMenuOption(choice);
        }catch (NumberFormatException ex){
            getMenuOption(100);
        }

    }

    public void getMenuOption(int choice){
        switch (choice){
            case 1: listOfBooks.printList();
                mainMenu();
                break;
            case 2:System.out.println("Give the code of the book");
                checkOutABook(userInput.read());
                break;
            /*case 3:System.out.println("Give the code of the book");
                returnABook(userInput.read());
                break;*/
            case 0: quit();
                break;
            default:System.out.println("Select a valid option!");
                mainMenu();
                break;

        }
    }

    public void checkOutABook(String choiceS){
        int choice;
        Book checkOutBook=null;
        try {
            choice= Integer.parseInt(choiceS);
            for(Book b:listOfBooks.list) {
                if(b.getCode()== choice) {
                    b.setIsAvailable(false);
                    checkOutBook=b;
                }
            }
            if (checkOutBook!=null){
                System.out.println("Thank you! Enjoy the book!");
                listOfBooks.updateList();
                mainMenu();
            }else throw new Exception() ;

        }catch (Exception ex){
            System.out.println("That book is not available.");
           getMenuOption(2);
        }


    }
  //  public void returnABook(String code){


  //  }

    public void quit(){
        System.exit(0);
    }

}
