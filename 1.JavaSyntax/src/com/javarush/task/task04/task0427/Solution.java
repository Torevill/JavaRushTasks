package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        isEven(a);

    }
    public static void isEven(int a){

        if (a < 1 || a > 999 ) return;
        else if (a / 100 != 0 && a % 2 == 0) System.out.println("четное трехзначное число");
        else if (a / 100 != 0 && a % 2 != 0) System.out.println("нечетное трехзначное число");
        else if (a / 10 != 0 && a % 2 == 0) System.out.println("четное двузначное число");
        else if (a / 10 != 0 && a % 2 != 0) System.out.println("нечетное двузначное число");
        else if (a % 2 == 0) System.out.println("четное однозначное число");
        else if (a % 2 != 0) System.out.println("нечетное однозначное число");
    }
}
