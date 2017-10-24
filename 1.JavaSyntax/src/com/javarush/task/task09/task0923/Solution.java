package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String vowels = "";
        String notVowels = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' '){
                continue;
            }
            else if (isVowel(string.charAt(i))){
                vowels += string.charAt(i);
                vowels += " ";
            }
            else{
                notVowels += string.charAt(i);
                notVowels += " ";
            }
        }
        System.out.println(vowels);
        System.out.println(notVowels);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}