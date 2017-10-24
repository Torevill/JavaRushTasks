package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        int countSpace = 0;
        int countAll = 0;
        FileInputStream in = new FileInputStream(args[0]);
        while (in.available() > 0){
            countAll++;
            if(in.read() == ' ')countSpace++;
        }

        float result = (float) ((float)countSpace/countAll*100.0);

        System.out.println(String.format(Locale.ENGLISH, "%.2f", result));

        in.close();

    }
}

