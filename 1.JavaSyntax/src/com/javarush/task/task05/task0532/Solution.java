package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Scanner;

/* 
Задача по алгоритмам

Написать программу, которая:
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. Нельзя добавлять новые методы в класс Solution.
4. Программа должна выводить на экран максимальное из введенных N чисел.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int maximum = scanner.nextInt();

        for (int i = 1; i < N; i++) {
            int now = scanner.nextInt();
            if (now > maximum){
                maximum = now;
            }
        }

        System.out.println(maximum);
    }
}
