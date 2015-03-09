package com.twu.entities;

import com.twu.entities.ItemOfBiblioteca;
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
public class ListOfMoviesTest {
    private ListOfMovies listOfMovies;

    @Rule
    public ExpectedException exception =ExpectedException.none();

    @Mock
    private ItemOfBiblioteca mockMovie;

    @Before
    public void setup(){
        initMocks(this);
        listOfMovies = new ListOfMovies();
    }

    @Test
    public void testPrintList(){
        exception.expect(Exception.class);
        doThrow(new Exception()).when(mockMovie).toString();
        listOfMovies.printList();
        verify(mockMovie).toString();
    }


    @Before
    public void setup2(){


    }
    //integration
    @Test
    public void shouldUpdateListWithFileWriter(){
        //given
        //when
        listOfMovies.updateList();
        //then

    }

}
