package com.twu.biblioteca;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by AlisProf on 24/2/2015.
 */
public class ListOfBooks {

    public ArrayList<Book> list;

    public ListOfBooks() {
        list = new ArrayList<Book>();
        Book book;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\AlisProf\\IdeaProjects\\TWU_Biblioteca-master\\Books"));
            String line = br.readLine();
            ArrayList<String> details=new ArrayList<String>();
            details.add(line);
           while (line != null) {
                line=br.readLine();
                details.add(line);
           }

            for (int i=0;i<details.size()-1;i+=5){
                book = new Book();
                book.setCode(Integer.parseInt(details.get(i)));
                book.setAuthor(details.get(i+1));
                book.setTitle(details.get(i+2));
                book.setYearOfPublication(Integer.parseInt(details.get(i+3)));
                book.setIsAvailable(Boolean.valueOf(details.get(i+4)));
                list.add(book);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    public void updateList(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\AlisProf\\IdeaProjects\\TWU_Biblioteca-master\\Books"));
            for(int i=0;i<list.size();i++){
                bw.write(Integer.toString(list.get(i).getCode()));
                bw.newLine();
                bw.write(list.get(i).getAuthor());
                bw.newLine();
                bw.write(list.get(i).getTitle());
                bw.newLine();
                bw.write(Integer.toString(list.get(i).getYearOfPublication()));
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
                System.out.println(list.get(i).getCode()+"      "+list.get(i).getAuthor()+"    "+list.get(i).getTitle()+"      "+list.get(i).getYearOfPublication());
            }
        }
    }


}
