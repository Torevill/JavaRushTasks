package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.equals(b)){
            System.out.println("Имена идентичны");
        }
        else if (a.length() == b.length()){
            System.out.println("Длины имен равны");
        }
    }
}
