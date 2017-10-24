package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        String file3 = scanner.nextLine();
        scanner.close();
        FileInputStream input2 = new FileInputStream(file2);
        FileInputStream input3 = new FileInputStream(file3);
        FileOutputStream output1 = new FileOutputStream(file1);
        while(input2.available()>0){
            output1.write(input2.read());
        }
        while(input3.available()>0){
            output1.write(input3.read());
        }
        input2.close();
        input3.close();
        output1.close();
    }
}
