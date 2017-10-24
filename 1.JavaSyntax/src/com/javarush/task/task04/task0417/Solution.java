package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        if (n1 == n2 && n2 == n3){
            System.out.println(n1 + " " + n2 + " " + n3);
        }
        else if(n1 == n2){
            System.out.println(n1 + " " + n2);
        }
        else if (n1 == n3){
            System.out.println(n1 + " " + n3);
        }
        else if (n2 == n3){
            System.out.println(n2 + " " + n3);
        }


    }
}