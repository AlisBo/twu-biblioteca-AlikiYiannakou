package com.twu.tools;

import com.twu.entities.ItemOfBiblioteca;

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
            /*for(ItemOfBiblioteca item:list){
                StringBuilder result = new StringBuilder();
                String newLine = System.getProperty("line.separator");

                //determine fields declared in this class only (no fields of superclass)
                Field[] fields = this.getClass().getDeclaredFields();

                //print field names paired with their values
                for ( Field field : fields  ) {
                    try {
                        //requires access to private field:
                        result.append(field.get(this));
                    } catch (IllegalAccessException ex) {
                        System.out.println(ex);
                    }
                    result.append(newLine);
                }
                bw.write(result.toString());
            }*/
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
}
