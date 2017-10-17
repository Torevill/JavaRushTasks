package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        FileInputStream input = new FileInputStream(fileName);
        TreeSet<Integer> bytes = new TreeSet<>();
        while (input.available()>0){
            int currentByte = input.read();
            bytes.add(currentByte);
        }
        input.close();
        for (Integer now:bytes){
            System.out.print(now.toString().concat(" "));
        }
    }
}
