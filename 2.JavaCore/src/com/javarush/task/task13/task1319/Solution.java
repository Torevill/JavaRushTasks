package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(name));
        while(true){
            String now = scanner.nextLine();
            bw.write(now + "\n");
            if (now.equals("exit")){
                break;
            }

        }
        scanner.close();
        bw.close();
    }
}
