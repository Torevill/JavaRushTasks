package com.javarush.task.task18.task1823;

import java.io.FileInputStream;

import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            String file = scanner.nextLine();
            if(file.equalsIgnoreCase("exit")){
                break;
            }
            ReadThread readThread = new ReadThread(file);
            readThread.start();

        }
        scanner.close();


    }

    public static class ReadThread extends Thread{
        String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run(){
            try {
                FileInputStream input = new FileInputStream(fileName);
                TreeMap<Integer, Integer> map = new TreeMap<>();
                while(input.available()>0){
                    int now = input.read();
                    map.merge(now, 1, Integer::sum);
                }
                int tempCounter = 0;
                int answ = 0;
                for (Map.Entry<Integer, Integer> now:map.entrySet()){
                    if (now.getValue()>tempCounter){
                        tempCounter = now.getValue();
                        answ = now.getKey();
                    }
                }
                resultMap.put(fileName,answ);
                input.close();
                this.interrupt();

            } catch (Exception e) {
                e.printStackTrace();
            }



        }
    }
}
