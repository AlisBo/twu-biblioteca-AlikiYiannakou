package com.twu.action;

import com.twu.entities.ItemOfBiblioteca;
import com.twu.entities.ListOfBooks;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by ayiannak on 10/03/2015.
 */
public class BibliotecaServicesForBooksTest {
    private BibliotecaServicesForBooks bookServices;

    @Mock
    private ListOfBooks mockListOfBooks;

    @Before
    public void setup(){
        initMocks(this);
        ItemOfBiblioteca mockBook= new ItemOfBiblioteca("0","title","Author",9999,true);
        mockListOfBooks=new ListOfBooks();
        mockListOfBooks.list.add(mockBook);
        bookServices=new BibliotecaServicesForBooks(mockListOfBooks);

    }

    @Test
    public void checkOutABookSuccessfully(){
        int actual=bookServices.checkOutABook("0");
        assertEquals(actual,1);

    }

    @Test
    public void checkOutABookUnSuccessfully(){
        int actual=bookServices.checkOutABook("0000");
        assertEquals(actual,0);

    }

    @Test
    public void returnABookSuccessfully(){
        int actual=bookServices.returnABook("0");
        assertEquals(actual,1);
    }

    @Test
    public void returnABookUnSuccessfully(){
        int actual = bookServices.returnABook("0000");
        assertEquals(actual,0);
    }


}
