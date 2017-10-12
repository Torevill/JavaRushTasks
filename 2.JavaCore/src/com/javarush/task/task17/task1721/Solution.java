package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fFile = scanner.nextLine();
        String sFile = scanner.nextLine();
        scanner.close();

        try {
            BufferedReader fReader = new BufferedReader(new InputStreamReader(new FileInputStream(fFile)));
            BufferedReader sReader = new BufferedReader(new InputStreamReader(new FileInputStream(sFile)));
            String now;
            while((now = fReader.readLine()) != null){
                allLines.add(now);
            }
            while((now = sReader.readLine()) != null){
                forRemoveLines.add(now);
            }
            fReader.close();
            sReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData () throws CorruptedDataException {
        boolean isContains = false;
        int counter = 0;
        for (String now:forRemoveLines){
            if (allLines.contains(now)){
                counter++;
            }
        }
        if (counter == forRemoveLines.size()){
            isContains = true;
        }

        if(isContains){
            for(String now:forRemoveLines){
                allLines.remove(now);
            }
        }
        else{
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
