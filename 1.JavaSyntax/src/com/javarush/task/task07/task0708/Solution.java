package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Инициализируй поле класса новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список strings.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            strings.add(scanner.nextLine());
            if (strings.get(i).length() > temp) {
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
