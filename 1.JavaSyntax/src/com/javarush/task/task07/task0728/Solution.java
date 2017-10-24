package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        boolean flag = false;
        do {
            flag = false;
            for (int i = 1; i < array.length; i++) {

                if (array[i] > array[i - 1]) {
                    flag = true;
                    swap(array, i - 1, i);
                }
            }
        }
        while(flag);
    }

    public static void swap(int[] array, int left, int right){
        if (left != right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

    }

}
