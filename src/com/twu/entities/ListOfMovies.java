package com.twu.entities;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by AlisProf on 1/3/2015.
 */
public class ListOfMovies {
    public ArrayList<Movie> list;

    public ListOfMovies() {
        list = new ArrayList<Movie>();
        Movie movie;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\AlisProf\\IdeaProjects\\TWU_Biblioteca-master\\Movies"));
            String line = br.readLine();
            ArrayList<String> details=new ArrayList<String>();
            details.add(line);
            while (line != null) {
                line=br.readLine();
                details.add(line);
            }

            for (int i=0;i<details.size()-1;i+=6){
                movie = new Movie();
                movie.setCode(details.get(i));
                movie.setTitle(details.get(i + 1));
                movie.setDirector(details.get(i + 2));
                movie.setYear(Integer.parseInt(details.get(i + 3)));
                movie.setRating(details.get(i+4));
                movie.setIsAvailable(Boolean.valueOf(details.get(i + 5)));
                list.add(movie);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    public void updateList(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\AlisProf\\IdeaProjects\\TWU_Biblioteca-master\\Books"));
            for(int i=0;i<list.size();i++){
                bw.write(list.get(i).getCode());
                bw.newLine();
                bw.write(list.get(i).getTitle());
                bw.newLine();
                bw.write(list.get(i).getDirector());
                bw.newLine();
                bw.write(Integer.toString(list.get(i).getYear()));
                bw.newLine();
                bw.write(list.get(i).getRating());
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
        System.out.println("Code:   Title:   Director:  Year:     Rating:");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIsAvailable()) {
                System.out.println(list.get(i).getCode()+"      "+list.get(i).getTitle()+"    "+list.get(i).getDirector()+"      "+list.get(i).getYear()+"       "+list.get(i).getRating());
            }
        }
    }


}
