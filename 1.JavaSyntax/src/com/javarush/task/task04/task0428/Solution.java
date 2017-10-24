package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int counter = 0;
        if (a > 0) counter++;
        if (b > 0) counter++;
        if (c > 0) counter++;
        System.out.println(counter);

    }
}
