package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> book = new HashMap<>();
        while (true) {
            String temp = reader.readLine();
            if (temp.isEmpty()) break;
            book.put(temp, reader.readLine());

        }
        System.out.println(book.get(reader.readLine()));

    }
}
