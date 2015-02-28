package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by AlisProf on 24/2/2015.
 */
public class ListOfBooks {

    public ArrayList<Book> list;


    public ListOfBooks(){
      list = new ArrayList<Book>();
        for(int i=0;i<10;i++){
            Book book=new Book();
            book.setTitle("Book"+i);
            book.setCode(i+1);
            book.setAuthor("Author"+i);
            book.setYearOfPublication(1990+i);
            book.setIsAvailable(true);
            list.add(book);
        }
    }

    public void printList(){
        System.out.println("Code:   Author:   Title:  Publication Year:");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIsAvailable()) {
                System.out.println(list.get(i).getCode()+"      "+list.get(i).getAuthor()+"    "+list.get(i).getTitle()+"      "+list.get(i).getYearOfPublication());
            }
        }
    }


}
