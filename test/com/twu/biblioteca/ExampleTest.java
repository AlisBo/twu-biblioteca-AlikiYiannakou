package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void run(){
        BibliotecaApp app= new BibliotecaApp();
        assertEquals("Welcome to Biblioteca!",app.run());
    }
}
