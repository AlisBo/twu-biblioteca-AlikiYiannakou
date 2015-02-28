package com.twu.entities;

/**
 * Created by AlisProf on 24/2/2015.
 */
public class Book {

    private String code;
    private String title;
    private String Author;
    private int yearOfPublication;
    private Boolean isAvailable;


    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
