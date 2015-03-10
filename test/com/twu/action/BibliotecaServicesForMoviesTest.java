package com.twu.action;

import com.twu.entities.ItemOfBiblioteca;
import com.twu.entities.ListOfMovies;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by ayiannak on 09/03/2015.
 */
public class BibliotecaServicesForMoviesTest {

    private BibliotecaServicesForMovies movieServices;

    @Mock
    private ListOfMovies mockListOfMovies;

    @Before
    public void setup(){
        initMocks(this);
        ItemOfBiblioteca mockMovie =new ItemOfBiblioteca("0","title","Director",9999,"3",true);
        mockListOfMovies=new ListOfMovies();
        mockListOfMovies.list.add(mockMovie);
        movieServices=new BibliotecaServicesForMovies(mockListOfMovies);
    }

    @Test
    public void checkOutAMovieSuccessfully(){
        int actual=movieServices.checkOutAMovie("0");
        assertEquals(actual,1);

    }

    @Test
    public void checkOutAMovieUnSuccessfully(){
        int actual=movieServices.checkOutAMovie("0000");
        assertEquals(actual,0);

    }

    @Test
    public void returnAMovieSuccessfully(){
        int actual=movieServices.returnAMovie("0");
        assertEquals(actual,1);
    }

    @Test
    public void returnAMovieUnSuccessfully(){
        int actual = movieServices.returnAMovie("0000");
        assertEquals(actual,0);
    }

}
