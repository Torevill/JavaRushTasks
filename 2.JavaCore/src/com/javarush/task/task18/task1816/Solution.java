package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        int counter = 0;
        String name = args[0];
        StringBuffer result = new StringBuffer("");
        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
        while(input.ready()){
            result.append(input.readLine());
        }
        input.close();
        String answ = result.toString();
        Pattern pat1 = Pattern.compile("[a-z]");
        Pattern pat2 = Pattern.compile("[A-Z]");
        Matcher m1 = pat1.matcher(answ);
        while(m1.find()) {
            counter++;
        }
        Matcher m2 = pat2.matcher(answ);
        while(m2.find()) {
            counter++;
        }
        System.out.println(counter);
    }
}
