package com.twu.entities;

import com.twu.tools.ReadFromTxtFile;
import com.twu.tools.WriteOnTxtFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ayiannak on 06/03/2015.
 */
public class ListOfCheckedOutBooks {
    public static Map<String,String> listOfCheckedOutBooks;
    private final String file="/Users/ayiannak/Documents/workspace/twu-biblioteca-AlikiYiannakou/CheckedOutBooks";

    public ListOfCheckedOutBooks(){
        listOfCheckedOutBooks=new HashMap<String, String>();
        ArrayList<String> details;
        ReadFromTxtFile reader=new ReadFromTxtFile(file);
        details=reader.getDetails();
        for(int i=0;i<details.size()-1;i+=2){
            listOfCheckedOutBooks.put(details.get(i),details.get(i+1));
        }
    }

    public void updateList(){
        ArrayList<String> list=new ArrayList<String>();
        for (String key: listOfCheckedOutBooks.keySet()) {
            list.add(key);
            list.add(listOfCheckedOutBooks.get(key));
        }
        WriteOnTxtFile writer = new WriteOnTxtFile(file);
        writer.writeOnFile(list);
    }

    public void addCheckedOutBook(String bookCode, String userLibraryNumber){
        listOfCheckedOutBooks.put(bookCode,userLibraryNumber);
        updateList();

    }

    public void removeReturnedBook(String bookCode, String userLibraryName){
        listOfCheckedOutBooks.remove(bookCode);
        updateList();
    }

}

