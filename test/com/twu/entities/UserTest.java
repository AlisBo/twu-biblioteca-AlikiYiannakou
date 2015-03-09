package com.twu.entities;

import com.twu.entities.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by ayiannak on 09/03/2015.
 */
public class UserTest {
    User userTest = new User("Aliki", "passwordTest", "444-4444", "aliki@gmail.com", "7478292");

    StringBuilder testResult = new StringBuilder();
    String newLine = System.getProperty("line.separator");

    @Test
    public void testToString() {
        testResult.append("Name: ");
        testResult.append("Aliki");
        testResult.append(newLine);
        testResult.append("Email: ");
        testResult.append("aliki@gmail.com");
        testResult.append(newLine);
        testResult.append("Phone number: ");
        testResult.append("7478292");
        testResult.append(newLine);

        assertEquals(testResult.toString(),userTest.toString());
    }


}

