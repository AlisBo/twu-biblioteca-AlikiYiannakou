package com.twu.biblioteca;

/**
 * Created by AlisProf on 24/2/2015.
 */
public class Book {

    private int code;
    private String title;
    private String Author;
    private int yearOfPublication;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }


    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }


}
