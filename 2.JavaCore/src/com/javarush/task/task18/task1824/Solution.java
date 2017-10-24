package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String fileName = scanner.nextLine();
            FileInputStream input = null;
            try {
                input = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                return;
            } finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                }

            }
        }
    }
}
