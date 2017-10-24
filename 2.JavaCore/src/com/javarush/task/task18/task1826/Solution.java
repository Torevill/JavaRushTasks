package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        String key = args[0];
        String inFileName = args[1];
        String outFileName = args[2];

        FileInputStream fin = new FileInputStream(inFileName);
        byte[] inFileBytes = new byte[fin.available()];
        fin.read(inFileBytes);
        fin.close();

        if ("-e".equals(key)) {
            for (int i = 0; i < inFileBytes.length; i++) {
                inFileBytes[i] = (byte) (inFileBytes[i] + 1);
            }
        } else if ("-d".equals(key)) {
            for (int i = 0; i < inFileBytes.length; i++) {
                inFileBytes[i] = (byte) (inFileBytes[i] - 1);
            }
        }

        FileOutputStream fout = new FileOutputStream(outFileName);
        fout.write(inFileBytes);
        fout.close();
    }
}
