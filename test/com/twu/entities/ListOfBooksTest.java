package com.twu.entities;

import org.junit.rules.ExpectedException;
import org.mockito.Mock;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by ayiannak on 09/03/2015.
 */
public class ListOfBooksTest {

    private ListOfBooks listOfBooks;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Mock
    private ItemOfBiblioteca mockBook;

    @Before
    public  void setup(){
        initMocks(this);
        listOfBooks=new ListOfBooks();

    }

    @Test
    public void testPrintList(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockBook).toString();
        listOfBooks.printList();
        verify(mockBook).toString();
    }


    //Integration
    @Test
    public void testUpdateListWithFileWriter(){

    }
}
