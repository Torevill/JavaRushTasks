package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(a);
        aList.add(b);
        aList.add(c);
        Collections.sort(aList);
        Collections.reverse(aList);
        for(Integer now : aList){
            System.out.print(now + " ");
        }
    }
}
