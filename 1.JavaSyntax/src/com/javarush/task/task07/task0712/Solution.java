package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 99999;

        for (int i = 0; i < 10; i++) {

            strings.add(scanner.nextLine());
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }
            if (strings.get(i).length() < min) {
                min = strings.get(i).length();
            }

        }


        for (String now : strings) {
            if (now.length() == min || now.length() == max) {
                System.out.println(now);
                break;
            }
        }

    }
}
