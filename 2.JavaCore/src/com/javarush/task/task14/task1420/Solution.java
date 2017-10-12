package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= 0 || b <= 0){
            throw new Exception();
        }
        System.out.println(gcd_1(a,b));
    }
    public static int gcd_1(int a, int b) {
        if (b == 0)
            return a;
        return gcd_1(b, a % b);
    }
}
