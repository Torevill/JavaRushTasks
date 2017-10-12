package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer url = new StringBuffer(scanner.nextLine());
        int question = url.indexOf("?");
        url.delete(0,question+1);
        String obj = "";
        if (url.indexOf("obj")!=-1){

            for (int i = url.indexOf("obj")+4; i < url.indexOf("&",url.indexOf("obj")); i++) {
                obj+=url.charAt(i);

            }
        }
        ArrayList<String> answ = new ArrayList<>();
        String nowStr="";
        for (int i = 0; i < url.length(); i++) {
            Character now = url.charAt(i);
            if (now.equals('&')){
                answ.add(nowStr);
                nowStr = "";
            }
            else if (now.equals('=')){
                answ.add(nowStr);
                nowStr = "";
                i = url.indexOf("&",i);
                if (i == -1) break;
            }
            else {
                nowStr += now;
            }
        }

        for (String now:answ){
            System.out.print(now + " ");
        }
        System.out.println();
        if (!obj.equalsIgnoreCase(""))
            try{
                alert(Double.parseDouble(obj));
            }
            catch (Exception e){
                alert(obj);
            }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
