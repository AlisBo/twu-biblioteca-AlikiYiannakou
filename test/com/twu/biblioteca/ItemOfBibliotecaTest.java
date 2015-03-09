package com.twu.biblioteca;

import com.twu.entities.ItemOfBiblioteca;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ayiannak on 09/03/2015.
 */
public class ItemOfBibliotecaTest {
    //Two types of items should be test book and movie depending on contructor

    ItemOfBiblioteca book = new ItemOfBiblioteca("99", "test title", "Author", 9999, true);
    ItemOfBiblioteca movie = new ItemOfBiblioteca("77", "test", "Director", 8888, "unrated", true);
    ItemOfBiblioteca book2 = new ItemOfBiblioteca("99", "test title", "Author", 9999, false);
    ItemOfBiblioteca movie2 = new ItemOfBiblioteca("77", "test", "Director", 8888, "unrated", false);

    @Test
    public void testToString() {
        String test1 = "99       test title       Author       9999       ";
        String test2 = "77       test       Director       8888       unrated       ";
        String test3 = "";
        String test4 = "";

        assertEquals(test1, book.toString());
        assertEquals(test2, movie.toString());
        assertEquals(test3, book2.toString());
        assertEquals(test4, movie2.toString());


    }

    @Test
    public void testToStringForBookTxtFile() {
        String expected = "99\ntest title\nAuthor\n9999\ntrue\n";

        String actual = book.toStringForTxtFile();

        assertEquals(expected, actual);
    }

    @Test
    public void testToStringForMovieTxtFile() {
        String expected = "77\ntest\nDirector\n8888\nunrated\ntrue\n";

        String actual = movie.toStringForTxtFile();

        assertEquals(expected, actual);
    }

}

