package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String fFile = scanner.nextLine();
        String sFile = scanner.nextLine();
        scanner.close();
        FileInputStream input = new FileInputStream(fFile);
        FileOutputStream output = new FileOutputStream(sFile);
        ArrayList<Byte> buffer = new ArrayList<>();
        while(input.available()>0){
            buffer.add((byte) input.read());
        }
        Collections.reverse(buffer);
        for(byte now:buffer){
            output.write(now);
        }
        input.close();
        output.close();
    }
}
