package com.javarush.task.task18.task1827;

/*
Прайсы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        if (args[0].equalsIgnoreCase("-c")) {
            String productName = args[1];
            String price = args[2];
            String quantity = args[3];
            String nextId = tradeGood.returnID(findId(fileName) + 1);
            FileOutputStream output = new FileOutputStream(fileName, true);
            productName = tradeGood.returnProdName(productName);
            price = tradeGood.returnPrice(price);
            quantity = tradeGood.returnQuant(quantity);
            output.write(nextId.getBytes());
            output.write(productName.getBytes());
            output.write(price.getBytes());
            output.write(quantity.getBytes());
            output.write(10);
            output.close();

        }


    }

    public static int findId(String fileName) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        int maxID = 0;
        while (reader.ready()) {
            String temp = reader.readLine();
            temp = temp.substring(0, 8);
            for (int i = 0; i < temp.length(); i++) {
                if (temp.toCharArray()[i] > '9' || temp.toCharArray()[i] < '0') {
                    temp = temp.substring(0, i);
                    break;
                }
            }
            if (Integer.parseInt(temp) > maxID) {
                maxID = Integer.parseInt(temp);
            }
        }
        reader.close();
        return maxID;
    }
}
