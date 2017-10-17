package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        FileInputStream input = new FileInputStream(fileName);
        int max = -128;
        while (input.available() > 0){
            int now = input.read();
            if (now > max){
                max = now;
            }
        }
        input.close();
        System.out.println(max);
    }
}
