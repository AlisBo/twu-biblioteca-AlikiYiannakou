package com.twu.tools;

import com.twu.entities.ItemOfBiblioteca;

import java.awt.print.Book;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by ayiannak on 05/03/2015.
 */
public class WriteOnTxtFile {
    private String file;
    private ArrayList<ItemOfBiblioteca> list;

    public WriteOnTxtFile(String file, ArrayList<ItemOfBiblioteca> list){
        this.file=file;
        this.list=list;

    }

    public void writeOnFile(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            for(int i=0;i<list.size();i++){
                ItemOfBiblioteca item=list.get(i);
                bw.write(item.toStringForTxtFile());
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
