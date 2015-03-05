package com.twu.tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by ayiannak on 05/03/2015.
 */
public class ReadFromTxtFile {

    private ArrayList<String> details;
    private String file;

    public ReadFromTxtFile(String file){
        this.file=file;
        this.details = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            details.add(line);
            while (line != null) {
                line=br.readLine();
                details.add(line);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<String> getDetails() {
        return details;
    }

}
