package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] arr1 = new int[20];
        for (int i = 0; i < 20; i++) {
            arr1[i] = scanner.nextInt();
        }
        int [] arr2 = new int[10];
        int [] arr3 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < 10; i++) {
            arr3[i] = arr1[i+10];
        }
        for(int now:arr3)
            System.out.println(now);


    }
}
