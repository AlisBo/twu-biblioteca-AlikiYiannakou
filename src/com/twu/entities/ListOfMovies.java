package com.twu.entities;

import com.twu.tools.ReadFromTxtFile;
import com.twu.tools.WriteOnTxtFile;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by AlisProf on 1/3/2015.
 */
public class ListOfMovies implements ListOfItems{
    public ArrayList<ItemOfBiblioteca> list;

    public ListOfMovies() {
        list = new ArrayList<ItemOfBiblioteca>();
        ArrayList<String> details;
        ItemOfBiblioteca movie;

        ReadFromTxtFile reader=new ReadFromTxtFile("/Users/ayiannak/Documents/workspace/twu-biblioteca-AlikiYiannakou/Movies");
        details=reader.getDetails();
            for (int i=0;i<details.size()-1;i+=6){
                movie = new ItemOfBiblioteca(details.get(i),details.get(i + 1),details.get(i + 2),
                        Integer.parseInt(details.get(i + 3)),details.get(i+4),Boolean.valueOf(details.get(i + 5)));
                list.add(movie);
            }

    }
    public void updateList(){
        WriteOnTxtFile writer = new WriteOnTxtFile("/Users/ayiannak/Documents/workspace/twu-biblioteca-AlikiYiannakou/Movies",list);
        writer.writeOnFile();
    }
    public void printList() {
        System.out.println("Code:   Title:   Director:  Year:     Rating:");
        for (ItemOfBiblioteca movie : list) {
            if (movie.getIsAvailable()) {
                System.out.println(movie.toString());//}

            }
        }
    }


}
