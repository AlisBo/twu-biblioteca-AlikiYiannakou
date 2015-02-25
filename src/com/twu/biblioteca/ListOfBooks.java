package com.twu.biblioteca;

import java.util.Map;

/**
 * Created by AlisProf on 24/2/2015.
 */
public class ListOfBooks {

    private Map<Book,Boolean> list;

    public void setList(Map<Book, Boolean> list) {
        this.list = list;
    }

    public Map<Book, Boolean> getList() {
        return list;
    }

}
