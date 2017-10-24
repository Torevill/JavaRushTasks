package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader year = new BufferedReader(new InputStreamReader(System.in));
        String b = year.readLine();
        int a = Integer.parseInt(b);
        int x;
        if(a%4!=0 || (a%400!=0 && a%100==0))
            x=365;
        else
            x=366;
        System.out.println("количество дней в году: " + x);

    }
}
