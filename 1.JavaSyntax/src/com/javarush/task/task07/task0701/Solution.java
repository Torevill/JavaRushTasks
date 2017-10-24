package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
        }

        
        return arr;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int now:array){
            if (now > max){
                max = now;
            }
        }
        return max;
    }
}
