package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
    public void testGetLisOfBook(){

        assertEquals(10,app.getLisOfBooks().size());

    }
}
