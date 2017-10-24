package com.javarush.task.task06.task0620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Исправляем ошибки юности
*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxNum = 0;

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        maxNum = a > b ? a : b;
        String max = "Max is " + maxNum;

        System.out.println(max);
    }

}
