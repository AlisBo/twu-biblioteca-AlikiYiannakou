package com.twu.entities;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by ayiannak on 09/03/2015.
 */
public class ListOfCheckedOutBooksTest {

    private ListOfCheckedOutBooks list;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Mock
    private ItemOfBiblioteca mockBook;
    private User user;

    @Before
    public  void setup(){
        initMocks(this);
        list=new ListOfCheckedOutBooks();

    }

    @Test
    public void testAddCheckedOutBook(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(list).updateList();
        list.addCheckedOutBook(mockBook.getCode(),user.getLibraryNumber());
        verify(list).updateList();

    }


    @Test
    public void testRemoveReturnedBook(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(list).updateList();
        list.removeReturnedBook(mockBook.getCode(),user.getLibraryNumber());
        verify(list).updateList();
    }
}
