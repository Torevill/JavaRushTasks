package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        try {
            while(true) {
                int i = scanner.nextInt();
                arr.add(i);
            }
        } catch (Exception e) {
            for (int now:arr){
                System.out.println(now);
            }
        }
    }
}
