package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        InputStream is = new BufferedInputStream(new FileInputStream(name));
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        ArrayList<Integer> array = new ArrayList<>();
        while(br.ready()){
            int now = Integer.parseInt(br.readLine());
            if(now%2 == 0) array.add(now);
        }
        Collections.sort(array);
        for(int now:array){
            System.out.println(now);
        }
        scanner.close();
        is.close();

    }
}
