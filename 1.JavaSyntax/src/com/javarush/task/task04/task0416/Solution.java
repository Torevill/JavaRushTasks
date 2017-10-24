package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        n %= 5;
        if (n >= 3 && n < 4){
            System.out.println("жёлтый");
        }
        else if (n >= 4){
            System.out.println("красный");
        }
        else{
            System.out.println("зелёный");
        }

    }
}