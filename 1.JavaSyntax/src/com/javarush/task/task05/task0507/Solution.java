package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double answ = 0;
        int counter = 0;
        while (true) {
            int a = scanner.nextInt();
            if (a == -1) break;
            answ += a;
            counter++;
        }
        System.out.println(answ/counter);
    }
}

