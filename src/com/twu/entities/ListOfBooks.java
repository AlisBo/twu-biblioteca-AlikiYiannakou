package com.twu.entities;

import com.twu.tools.ReadFromTxtFile;
import com.twu.tools.WriteOnTxtFile;
import java.util.ArrayList;


/**
 * Created by AlisProf on 24/2/2015.
 */
public class ListOfBooks implements ListOfItems {

    public ArrayList<ItemOfBiblioteca> list;

    public ListOfBooks() {
        list = new ArrayList<ItemOfBiblioteca>();
        ItemOfBiblioteca book;
        ArrayList<String> details;

        ReadFromTxtFile reader=new ReadFromTxtFile("/Users/ayiannak/Documents/workspace/twu-biblioteca-AlikiYiannakou/Books");
        details=reader.getDetails();
            for (int i=0;i<details.size()-1;i+=5){
                book = new ItemOfBiblioteca(details.get(i),details.get(i + 2),details.get(i + 1),
                        Integer.parseInt(details.get(i + 3)),Boolean.valueOf(details.get(i + 4)));
               list.add(book);
                System.out.print(book.getCode());
            }
        }

    public void updateList(){
        WriteOnTxtFile writer = new WriteOnTxtFile("/Users/ayiannak/Documents/workspace/twu-biblioteca-AlikiYiannakou/Books",list);
        writer.writeOnFile();
    }
    public void printList() {
        System.out.println("Code:   Author:   Title:  Publication Year:");
        for (ItemOfBiblioteca book : list) {
            if (book.getIsAvailable()) {
                System.out.println(book.toString());//}

            }

        }
    }


}
