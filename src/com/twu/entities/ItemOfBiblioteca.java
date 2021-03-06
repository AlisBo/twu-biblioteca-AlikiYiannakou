package com.twu.entities;

import java.lang.reflect.Field;

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


    public ItemOfBiblioteca(String code, String title, String authorDirector, int year, String rating, Boolean isAvailable) {
        this.code = code;
        this.title = title;
        this.authorDirector = authorDirector;
        this.year = year;
        this.rating = rating;
        this.isAvailable = isAvailable;

    }

    public ItemOfBiblioteca(String code, String title, String authorDirector, int year, Boolean isAvailable) {
        //constructor for books
        this(code, title, authorDirector, year, null, isAvailable);

    }

    public String getCode() {
        return code;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString() {

        StringBuilder result = new StringBuilder();
        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                if (!field.getName().equals("isAvailable")&&isAvailable && (field.get(this) != null)) {
                    result.append(field.get(this));
                    result.append("       ");
                }
            } catch (IllegalAccessException ex) {
                System.out.println(ex);
            }
        }
        return result.toString();
    }

    public String toStringForTxtFile() {

        StringBuilder result = new StringBuilder();
        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = this.getClass().getDeclaredFields();
        String newLine = System.getProperty("line.separator");
        for (Field field : fields) {
            try {
                if (field.get(this) != null) {
                    result.append(field.get(this));
                    result.append(newLine);
                }
            } catch (IllegalAccessException ex) {
                System.out.println(ex);
            }
        }
        return result.toString();
    }

}
