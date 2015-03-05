package com.twu.action;

import com.sun.net.httpserver.Authenticator;
import com.twu.entities.ItemOfBiblioteca;

import java.util.ArrayList;

/**
 * Created by ayiannak on 05/03/2015.
 */
public class BibliotecaServices {
    private ArrayList<ItemOfBiblioteca> list;
    private String code;
    private final String SUCCESSFUL_CHECK_OUT="Thank you! Enjoy the book!";
    private final String UNSUCCESSFUL_SERVICE ="This is not a valid book";
    private final String SUCCESSFUL_RETURN="Thank you for returning the book";

    public BibliotecaServices(ArrayList<ItemOfBiblioteca> list,String code){
        this.list=list;
        this.code=code;
    }


}
