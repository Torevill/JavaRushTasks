package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            scanner.close();
            FileInputStream input = new FileInputStream(fileName);
            HashMap<Integer, Integer> bytes = new HashMap<>();
            while (input.available()>0){
                int currentByte = input.read();
                bytes.merge(currentByte, 1, Integer::sum);
            }
            int temp = 200000;
            for (Map.Entry<Integer, Integer> now:bytes.entrySet()){
                if (now.getValue() < temp){
                    temp = now.getValue();
                }
            }
            for (Map.Entry<Integer, Integer> now:bytes.entrySet()){
                if (now.getValue() == temp){
                    System.out.print(now.getKey() + " ");
                }
            }
            input.close();

    }
}
