package com.twu.biblioteca;


import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExampleTest {
    BibliotecaApp app= new BibliotecaApp();
    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testRun(){

        assertEquals("Welcome to Biblioteca!",app.run());
    }

    @Test
    public void testGetListOfBook(){

        assertEquals(10,app.getListOfBooks().size());

    }

  //  @Test
   // public void testMainMenu(){

  //  }

   // @Test
   // public void testGetMenuOption(){
        //assertTrue();

    //}
}
