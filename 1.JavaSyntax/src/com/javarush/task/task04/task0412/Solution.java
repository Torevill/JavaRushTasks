package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0){
            System.out.println(n *= 2);
        }
        else if (n < 0){
            System.out.println(n + 1);
        }
        else{
            System.out.println(0);
        }

    }

}