package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream input = new FileInputStream(scanner.nextLine());
        int counter = 0;
        while (input.available() > 0){
            int now = input.read();
            if (now == ','){
                counter++;
            }
        }
        System.out.println(counter);
        input.close();
        scanner.close();
    }
}
