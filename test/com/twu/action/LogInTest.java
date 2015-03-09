package com.twu.action;

import com.twu.entities.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by ayiannak on 09/03/2015.
 */
public class LogInTest {

    private LogIn logInTest=new LogIn();


    @Test
    public void validateUserTest(){
        User userTest = new User("Aliki", "passwordTest", "444-4444", "aliki@gmail.com", "7478292");
        logInTest.listOfUsers.add(userTest);
       Boolean actual=logInTest.validateUser(userTest.getLibraryNumber(),userTest.getPassword());
      assertTrue(actual);
    }


}
