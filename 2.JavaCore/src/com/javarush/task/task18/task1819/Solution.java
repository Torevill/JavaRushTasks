package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();

        scanner.close();
        FileInputStream input1 = new FileInputStream(file1);
        byte[] temp = new byte[input1.available()];
        int i=0;
        while(input1.available() > 0){
            temp[i++] = (byte)input1.read();
        }
        input1.close();

        FileOutputStream output1 = new FileOutputStream(file1);
        FileInputStream input2 = new FileInputStream(file2);

        while(input2.available()>0){
           output1.write(input2.read());
        }
        for (byte now:temp){
            output1.write(now);
        }
        input2.close();
        output1.close();



    }
}
