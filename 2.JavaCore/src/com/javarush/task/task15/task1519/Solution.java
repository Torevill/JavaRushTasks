package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char i = 'v';
        while (true) {
            String now = scanner.nextLine();
            if (now.equalsIgnoreCase("exit")) {
                break;
            }

            try{
                if (now.indexOf(".") != -1) {
                    print(Double.parseDouble(now));
                }
                else if (Integer.parseInt(now) > 0 && Integer.parseInt(now) < 128) {
                    print((short) Short.parseShort(now));
                }
                else if(Integer.parseInt(now) <= 0 || Integer.parseInt(now) >= 128){
                    print(Integer.parseInt(now));
                }

            }
            catch(Exception e){
                print(now);
            }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
