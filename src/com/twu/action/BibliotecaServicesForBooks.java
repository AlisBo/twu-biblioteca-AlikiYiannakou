package com.twu.action;

import com.twu.entities.ItemOfBiblioteca;
import com.twu.entities.ListOfBooks;

/**
 * Created by ayiannak on 05/03/2015.
 */

public class BibliotecaServicesForBooks {
    private ListOfBooks listOfBooks;
    final String SUCCESSFUL_CHECK_OUT = "Thank you! Enjoy the book!";
    final String UNSUCCESSFUL_CHECK_OUT = "This is not a valid book";
    final String SUCCESSFUL_RETURN = "Thank you for returning the book!";
    final String UNSUCCESSFUL_RETURN="That is not a valid book to return.";
    private LogIn exit = new LogIn();

    public BibliotecaServicesForBooks(ListOfBooks list) {
        this.listOfBooks = list;
    }

    public int checkOutABook(String code) {
        int flag=0;
        try {
            for (ItemOfBiblioteca item : listOfBooks.list) {
                if (item.getCode().equals(code) && item.getIsAvailable()) {
                    item.setIsAvailable(false);
                    flag=1;
                }
            }
            if (flag==1) {
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

        ItemOfBiblioteca checkOutBook=null;
        try {

            for (ItemOfBiblioteca b : listOfBooks.list) {
                if (b.getCode().equals(code) && !b.getIsAvailable()) {
                    b.setIsAvailable(true);
                    checkOutBook = b;
                }
            }
            if (checkOutBook != null) {
                System.out.println(SUCCESSFUL_RETURN);
                listOfBooks.updateList();
                return 1;
            } else throw new Exception();

        } catch (Exception ex) {
            if (code.equals("0")) exit.quit();
            System.out.println(UNSUCCESSFUL_RETURN);
            return 0;
        }


    }


}