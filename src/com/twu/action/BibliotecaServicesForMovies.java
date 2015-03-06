package com.twu.action;

import com.twu.entities.ItemOfBiblioteca;
import com.twu.entities.ListOfMovies;


/**
 * Created by ayiannak on 06/03/2015.
 */
public class BibliotecaServicesForMovies {
    private ListOfMovies listOfMovies;
    final String SUCCESSFUL_CHECK_OUT = "Thank you! Enjoy the movie!";
    final String UNSUCCESSFUL_CHECK_OUT = "This is not a valid movie";
    final String SUCCESSFUL_RETURN = "Thank you for returning the movie!";
    final String UNSUCCESSFUL_RETURN = "That is not a valid movie to return.";
    private LogOut exit;

    public BibliotecaServicesForMovies(ListOfMovies list) {
        listOfMovies = list;
        exit = new LogOut();

    }

    public int checkOutAMovie(String code) {
        int flag = 0;
        try {
            for (ItemOfBiblioteca item : listOfMovies.list) {
                if (item.getCode().equals(code) && item.getIsAvailable()) {
                    item.setIsAvailable(false);
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(SUCCESSFUL_CHECK_OUT);
                listOfMovies.updateList();
                return flag;
            } else throw new Exception();
        } catch (Exception ex) {
            if (code.equals("0")) exit.quit();
            System.out.println(UNSUCCESSFUL_CHECK_OUT);
            return flag;
        }
    }

    public int returnAMovie(String code) {
        int flag = 0;
        try {
            for (ItemOfBiblioteca item : listOfMovies.list) {
                if (item.getCode().equals(code) && !item.getIsAvailable()) {
                    item.setIsAvailable(true);
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(SUCCESSFUL_RETURN);
                listOfMovies.updateList();
                return flag;
            } else throw new Exception();
        } catch (Exception ex) {
            if (code.equals("0")) exit.quit();
            System.out.println(UNSUCCESSFUL_RETURN);
            return flag;
        }

    }

}

