package com.twu.entities;

/**
 * Created by AlisProf on 1/3/2015.
 */
public class ItemOfBiblioteca {

    private String code;
    private String title;
    private String authorDirector;
    private int year;
    private String rating; //1-10 or unrated
    private Boolean isAvailable;


    public ItemOfBiblioteca(String code,String title,String authorDirector,int year,String rating,Boolean isAvailable ){
        //constructor for movies
        this.code=code;
        this.title=title;
        this.authorDirector=authorDirector;
        this.year=year;
        this.rating=rating;
        this.isAvailable=isAvailable;

    }

    public ItemOfBiblioteca(String code,String title,String authorDirector,int year,Boolean isAvailable ){
        //constructor for books
        this(code,title,authorDirector,year,null,isAvailable);

    }

    public String getAuthorDirector() {
        return authorDirector;
    }

    public String getCode() {
        return code;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


}
