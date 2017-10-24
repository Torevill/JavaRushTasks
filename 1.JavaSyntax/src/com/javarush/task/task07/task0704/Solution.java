package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int j = 0; j < 5; j++) {
            int temp = arr[j];
            arr[j] = arr[9-j];
            arr[9-j] = temp;
        }
        for (int now:arr){
            System.out.println(now);
        }


    }
}

