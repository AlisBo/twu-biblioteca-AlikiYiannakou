package com.twu.entities;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by AlisProf on 1/3/2015.
 */
public class ListOfItems {

    private ArrayList<ItemOfBiblioteca> list;
    private String file;
    private ItemOfBiblioteca item;
    private ArrayList<String> details;


    public ListOfItems(String file) {
        list = new ArrayList<ItemOfBiblioteca>();
        this.file=file;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            details=new ArrayList<String>();
            details.add(line);
            while (line != null) {
                line=br.readLine();
                details.add(line);
            }


        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ItemOfBiblioteca> createListOfBooks(){
        for (int i=0;i<details.size()-1;i+=5){
            item = new ItemOfBiblioteca(details.get(i),details.get(i + 2),details.get(i + 1),
                    Integer.parseInt(details.get(i + 3)),Boolean.valueOf(details.get(i + 4)));
            this.list.add(item);
        }
        return this.list;
    }

    public ArrayList<ItemOfBiblioteca> createListOfMovies() {
        for (int i = 0; i < details.size() - 1; i += 6) {
            item = new ItemOfBiblioteca(details.get(i), details.get(i + 1), details.get(i + 2),
                    Integer.parseInt(details.get(i + 3)), details.get(i + 4), Boolean.valueOf(details.get(i + 5)));
            list.add(item);
        }
        return list;
    }

    public void updateList(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\AlisProf\\IdeaProjects\\TWU_Biblioteca-master\\Books"));
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
    public void printListOfMovies(){
        System.out.println("Code:   Title:   Director:  Year:     Rating:");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIsAvailable()) {
                System.out.println(list.get(i).getCode()+"      "+list.get(i).getTitle()+"    "+
                        list.get(i).getAuthorDirector()+"      "+list.get(i).getYear()+"       "+list.get(i).getRating());
            }
        }
    }
    public void printListOfBooks(){
        for (int i=0;i<details.size()-1;i+=5){
            item = new ItemOfBiblioteca(details.get(i),details.get(i + 2),details.get(i + 1),
                    Integer.parseInt(details.get(i + 3)),Boolean.valueOf(details.get(i + 4)));
            this.list.add(item);
        }
        System.out.println("Code:   Author:   Title:  Publication Year:");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIsAvailable()) {
                System.out.println(list.get(i).getCode()+"      "+list.get(i).getAuthorDirector()+"    "+
                        list.get(i).getTitle()+"      "+list.get(i).getYear());
            }
        }
    }

}
