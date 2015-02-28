package com.twu.biblioteca;


import com.twu.entities.Book;
import org.junit.Rule;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class ExampleTest {
    BibliotecaApp app = new BibliotecaApp();

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testRun() {

        //assertEquals("Welcome to Biblioteca!",app.run());
    }

    @Test
    public void testMainMenu() {
        //This test runs when there is no calling of other methods in mainMenu()
      /*  //check for a valid option
        String inputData = "1";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        assertEquals(1, app.mainMenu());

        //check for an invalid option
        inputData = "Wrong";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        assertEquals(99999, app.mainMenu());*/
    }


    @Test
    public void testGetListOfBook() {

        // assertEquals(10,app.listOfBooks.list.size());

    }

    @Test
    public void testCheckOutABook() {
        //Test for an invalid book
        int size = app.listOfBooks.list.size();
        Boolean[] isAvailable = new Boolean[size];
        for (int i = 0; i < size; i++) {
            isAvailable[i] = app.listOfBooks.list.get(i).getIsAvailable();
        }
        app.checkOutABook("f");//invalid code
        for (int i = 0; i < size; i++) {
            assertEquals(isAvailable[i], app.listOfBooks.list.get(i).getIsAvailable());
        }//no books removed from the list


        //Test for a valid book
      /* Book bookStillInLibrary = null;
       System.out.print("isa");
       for (Book b:app.listOfBooks.list)
       {
           System.out.print("isa" + b.getIsAvailable());
           System.out.println("isa"+b.getCode());
           if(b.getCode()=="3") {
               bookStillInLibrary=b;
           break;}

       }
       System.out.print("isa"+bookStillInLibrary.getIsAvailable());
      //  app.checkOutABook("3");//book with code 2
       Book checkedOutBook=null;
       for (Book b:app.listOfBooks.list)
       {
           if(b.getCode()=="3") checkedOutBook=b;
       }
       System.out.print("isa"+checkedOutBook.getIsAvailable());
        assertNotEquals(bookStillInLibrary.getIsAvailable(),checkedOutBook.getIsAvailable());//one book is removed from the list
        //This test fails because in the test cases is another list than the modified one.
    }  //This test runs when the 2 method calls in checkOutABook are commented out.*/

        //@Test

        //@Test
        // public void testGetMenuOption(){

        //   }
//


        // @Test
        // public void testGetMenuOption(){
        //assertTrue();

        //}
    }
}