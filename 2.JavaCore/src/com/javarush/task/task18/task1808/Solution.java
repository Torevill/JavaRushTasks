package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        FileOutputStream out2 = new FileOutputStream(new File(reader.readLine()));
        FileOutputStream out3 = new FileOutputStream(new File(reader.readLine()));



        while(in.available() > 0){
            if(in.available() % 2 == 0){
                byte[] o1 = new byte[in.available()/2];
                byte[] o2 = new byte[in.available()/2];
                int count1 = in.read(o1);
                int count2 = in.read(o2);
                out2.write(o1, 0, count1);
                out3.write(o2, 0, count2);
            } else {
                byte[] o1 = new byte[in.available()/2 + 1];
                byte[] o2 = new byte[in.available()/2];
                int count1 = in.read(o1);
                int count2 = in.read(o2);
                out2.write(o1, 0, count1);
                out3.write(o2, 0, count2);
            }
        }

        reader.close();
        in.close();
        out2.close();
        out3.close();

        /*Scanner scanner = new Scanner(System.in);
        String inFile = scanner.nextLine();
        String outFile1 = scanner.nextLine();
        String outFile2 = scanner.nextLine();
        scanner.close();
        FileInputStream input = new FileInputStream(inFile);
        FileOutputStream output1 = new FileOutputStream(outFile1);
        FileOutputStream output2 = new FileOutputStream(outFile2);
        int fHalf = input.available()/2;

        for (int i = 0; i <= fHalf; i++) {
            output1.write(input.read());
        }
        while (input.available()>0){
            output2.write(input.read());
        }
        input.close();
        output1.close();
        output2.close();*/

    }
}
