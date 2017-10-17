package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String file = scanner.nextLine();
            FileInputStream input = new FileInputStream(file);
            if(input.available() < 1000){
                input.close();
                scanner.close();
                throw new DownloadException();
            }
        }


    }

    public static class DownloadException extends Exception {

    }
}
