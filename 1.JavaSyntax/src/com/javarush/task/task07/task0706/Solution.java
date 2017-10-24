package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int [] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = scanner.nextInt();
            if (i == 0 || i % 2==0){
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }
        System.out.println(even < odd ? "В домах с нечетными номерами проживает больше жителей." : "В домах с четными номерами проживает больше жителей.");


    }
}
