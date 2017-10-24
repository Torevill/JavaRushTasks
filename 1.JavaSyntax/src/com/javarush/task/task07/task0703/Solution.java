package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] arrS = new String[10];
        for (int i = 0; i < 10; i++) {
            arrS[i] = scanner.nextLine();
        }

        int [] arr = new int[10];
        for (int j = 0; j < 10; j++) {
            arr[j] = arrS[j].length();
        }

        for(int now:arr){
            System.out.println(now);
        }
    }
}
