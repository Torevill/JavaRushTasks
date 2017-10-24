package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);

        }
        for (int now : a) {
            System.out.println(now);
        }
        System.out.println();
        boolean flag = false;
        do{
            flag = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i] > a[i - 1]){
                    flag = true;
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                }
            }
        }while(flag);

        for (int now : a) {
            System.out.println(now);
        }

    }
}
