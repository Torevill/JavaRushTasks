package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String dateIn = scanner.nextLine();
        Date date = new Date(dateIn);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy" , Locale.ENGLISH);
        System.out.println(dateFormat.format(date).toUpperCase());
    }
}
