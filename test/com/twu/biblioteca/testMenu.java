package com.twu.biblioteca;

import com.twu.action.BibliotecaServicesForBooks;
import com.twu.action.BibliotecaServicesForMovies;
import com.twu.action.LogIn;
import com.twu.entities.ItemOfBiblioteca;
import com.twu.entities.ListOfBooks;
import com.twu.entities.ListOfCheckedOutBooks;
import com.twu.entities.ListOfMovies;
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
public class testMenu {

    private Menu menuTest;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Mock
    private ListOfCheckedOutBooks mockCheckedOutBook;
    private ListOfMovies mockListOfmovies;
    private ListOfBooks mockListOfBooks;
    private LogIn mockLogin;
    private BibliotecaServicesForMovies mockMovieServices;
    private BibliotecaServicesForBooks mockBookServices;


    @Before
    public void setup(){
        initMocks(this);
        menuTest=new Menu();
    }

    @Test
    public  void testGetMenuOptionCase1(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockListOfBooks).printList();
        menuTest.getMenuOption(1);
        verify(mockListOfBooks).printList();
    }


    @Test
    public void testGetMenuOptionCase2(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(menuTest).logUserIn();
        menuTest.getMenuOption(2);
        verify(menuTest).logUserIn();


    }

    @Test
    public void testGetMenuOptionCase2b(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockCheckedOutBook).addCheckedOutBook("0",mockLogin.userLoggedIn.getLibraryNumber());
        menuTest.getMenuOption(2);
        verify(mockCheckedOutBook).addCheckedOutBook("0", mockLogin.userLoggedIn.getLibraryNumber());
    }

    @Test
    public void testGetMenuOptionCase2c(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockBookServices).checkOutABook("0");
        menuTest.getMenuOption(2);
        verify(mockBookServices).checkOutABook("0");
    }


    @Test
    public void testGetMenuOptionCase3() {
        exception.expect(Exception.class);
        doThrow(new Exception()).when(menuTest).logUserIn();
        menuTest.getMenuOption(3);
        verify(menuTest).logUserIn();

    }

    @Test
    public void testGetMenuOptionCase3b(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockCheckedOutBook).removeReturnedBook("0",mockLogin.userLoggedIn.getLibraryNumber());
        menuTest.getMenuOption(3);
        verify(mockCheckedOutBook).removeReturnedBook("0",mockLogin.userLoggedIn.getLibraryNumber());
    }

    @Test
    public void testGetMenuOptionCase3c(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockBookServices).returnABook("0");
        menuTest.getMenuOption(3);
        verify(mockBookServices).returnABook("0");
    }

    @Test
    public  void testGetMenuOptionCase4(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockListOfmovies).printList();
        menuTest.getMenuOption(4);
        verify(mockListOfmovies).printList();
    }


    @Test
    public void testGetMenuOptionCase5(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(menuTest).logUserIn();
        menuTest.getMenuOption(5);
        verify(menuTest).logUserIn();


    }

    @Test
    public void testGetMenuOptionCase5b(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockMovieServices).checkOutAMovie("0");
        menuTest.getMenuOption(5);
        verify(mockMovieServices).checkOutAMovie("0");
    }


    @Test
    public void testGetMenuOptionCase6() {
        exception.expect(Exception.class);
        doThrow(new Exception()).when(menuTest).logUserIn();
        menuTest.getMenuOption(6);
        verify(menuTest).logUserIn();

    }

    @Test
    public void testGetMenuOptionCase6b() {
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockBookServices).returnABook("0");
        menuTest.getMenuOption(6);
        verify(mockBookServices).returnABook("0");
    }


}
