package com.twu.entities;

import com.twu.tools.ReadFromTxtFile;

import java.awt.print.Book;
import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AlisProf on 24/2/2015.
 */
public class ListOfBooks {

    public ArrayList<ItemOfBiblioteca> list;

    public ListOfBooks() {
        list = new ArrayList<ItemOfBiblioteca>();
        ItemOfBiblioteca book;
        ArrayList<String> details= new ArrayList<String>();

        ReadFromTxtFile reader=new ReadFromTxtFile("/Users/ayiannak/Documents/workspace/twu-biblioteca-AlikiYiannakou/Books");
        details=reader.getDetails();
            for (int i=0;i<details.size()-1;i+=5){
                book = new ItemOfBiblioteca(details.get(i),details.get(i + 2),details.get(i + 1),
                        Integer.parseInt(details.get(i + 3)),Boolean.valueOf(details.get(i + 4)));
                list.add(book);
            }
        }

    public void updateList(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/ayiannak/Documents/workspace/twu-biblioteca-AlikiYiannakou/Books"));
            for(int i=0;i<list.size();i++){
                bw.write(list.get(i).getCode());
                bw.newLine();
                bw.write(list.get(i).getAuthorDirector());
                bw.newLine();
                bw.write(list.get(i).getTitle());
                bw.newLine();
                bw.write(Integer.toString(list.get(i).getYear()));
                bw.newLine();
                bw.write(String.valueOf(list.get(i).getIsAvailable()));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void printList(){
        System.out.println("Code:   Author:   Title:  Publication Year:");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIsAvailable()) {
                System.out.println(list.get(i).getCode()+"      "+list.get(i).getAuthorDirector()+"    "+
                        list.get(i).getTitle()+"      "+list.get(i).getYear());
            }
        }

    }


}
