package com.twu.action;

import com.twu.entities.ItemOfBiblioteca;
import com.twu.entities.ListOfBooks;
import com.twu.entities.ListOfCheckedOutBooks;

/**
 * Created by ayiannak on 05/03/2015.
 */

public class BibliotecaServicesForBooks {
    private ListOfBooks listOfBooks;
    final String SUCCESSFUL_CHECK_OUT = "Thank you! Enjoy the book!";
    final String UNSUCCESSFUL_CHECK_OUT = "This is not a valid book";
    final String SUCCESSFUL_RETURN = "Thank you for returning the book!";
    final String UNSUCCESSFUL_RETURN = "That is not a valid book to return.";
    private LogOut exit;

    public BibliotecaServicesForBooks(ListOfBooks list) {
        this.listOfBooks = list;
        this.exit = new LogOut();
    }

    public int checkOutABook(String code) {
        int flag = 0;
        try {
            for (ItemOfBiblioteca item : listOfBooks.list) {
                if (item.getCode().equals(code) && item.getIsAvailable()) {
                    item.setIsAvailable(false);
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(SUCCESSFUL_CHECK_OUT);
                listOfBooks.updateList();
                return flag;
            } else throw new Exception();

        } catch (Exception ex) {
            if (code.equals("0")) exit.quit();
            System.out.println(UNSUCCESSFUL_CHECK_OUT);
            return flag;
        }


    }

    public int returnABook(String code) {

        int flag = 0;
        try {

            for (ItemOfBiblioteca b : listOfBooks.list) {
                if (b.getCode().equals(code) && !b.getIsAvailable()) {
                    b.setIsAvailable(true);
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(SUCCESSFUL_RETURN);
                listOfBooks.updateList();
                return flag;
            } else throw new Exception();

        } catch (Exception ex) {
            if (code.equals("0")) exit.quit();
            System.out.println(UNSUCCESSFUL_RETURN);
            return flag;
        }


    }


}