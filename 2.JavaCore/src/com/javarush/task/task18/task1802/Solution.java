package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        FileInputStream input = new FileInputStream(fileName);
        int min = 127;
        while (input.available() > 0){
            int now = input.read();
            if (now < min){
                min = now;
            }
        }
        input.close();
        System.out.println(min);
    }
}
