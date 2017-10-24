package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        int temp = 9999999;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            strings.add(scanner.nextLine());
            if (strings.get(i).length() < temp) {
                temp = strings.get(i).length();
            }
        }

        for (String now : strings) {
            if (now.length() == temp) {
                System.out.println(now);
            }
        }
    }
}
