package com.twu.tools;

import java.util.Scanner;

/**
 * Created by AlisProf on 28/2/2015.
 */
public class ReadFromConsole {
    Scanner keyboard;
    public String read(){
        keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }

}
