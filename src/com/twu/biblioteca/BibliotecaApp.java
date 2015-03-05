package com.twu.biblioteca;


        import com.twu.entities.ItemOfBiblioteca;
        import com.twu.entities.ListOfBooks;
        import com.twu.tools.ReadFromConsole;

public class BibliotecaApp {

   // ReadFromConsole userInput =new ReadFromConsole();
    //ListOfBooks listOfBooks=new ListOfBooks();

    public static void main(String[] args) {
       BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.run();
    }

    public void run(){
        String welcomeMessage = "Welcome to Biblioteca!";
        System.out.println(welcomeMessage);
        Menu menu=new Menu();
       // Library biblioteca=new Library();
        //biblioteca.
        while(true){
           menu.mainMenu();
        }
    }
 /* public void mainMenu(){
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
            case 2:do{System.out.println("Give the code of the book");
            }while(checkOutABook(userInput.read())==0);
                break;
            case 3:do {System.out.println("Give the code of the book");
            }while(returnABook(userInput.read())==0);
                break;
            case 0: quit();
                break;
            default:System.out.println("Select a valid option!");
                break;

        }
    }

    public int checkOutABook(String code){
        ItemOfBiblioteca checkOutBook=null;
        try {
            for(ItemOfBiblioteca b:listOfBooks.list) {
                if(b.getCode().equals(code)&& b.getIsAvailable()) {
                    b.setIsAvailable(false);
                    checkOutBook=b;
                }
            }
            if (checkOutBook!=null){
                System.out.println("Thank you! Enjoy the book!");
                listOfBooks.updateList();
                return 1;
            }else throw new Exception() ;

        }catch (Exception ex){
            if(code.equals("0")) quit();
            System.out.println("That book is not available.");
           return 0;
        }


    }
    public int returnABook(String code){

        ItemOfBiblioteca checkOutBook=null;
        try {

            for(ItemOfBiblioteca b:listOfBooks.list) {
                if(b.getCode().equals(code)&& !b.getIsAvailable()) {
                    b.setIsAvailable(true);
                    checkOutBook=b;
                }
            }
            if (checkOutBook!=null){
                System.out.println("Thank you for returning the book");
                listOfBooks.updateList();
                return 1;
               // mainMenu();
            }else throw new Exception() ;

        }catch (Exception ex){
            if(code.equals("0")) quit();
            System.out.println("That is not a valid book to return.");
            getMenuOption(3);
            return 0;
        }



    }

    public void quit(){
        System.exit(0);
    }*/

}
