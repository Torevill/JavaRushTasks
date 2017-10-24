package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] a = new ArrayList[5];
        for(int i = 0; i < a.length; i++) {
            a[i] = new ArrayList<String>();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                a[i].add("new" + (i+j));
            }

        }



        return a;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}