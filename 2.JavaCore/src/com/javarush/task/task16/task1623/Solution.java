package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        @Override
        public String toString() {
            return this.getName() +" created";
        }

        @Override
        public void run() {
            if (countCreatedThreads < count){
                GenerateThread generateThread = new GenerateThread();
                System.out.println(generateThread);
            }


        }

        public GenerateThread(){
            super(Integer.valueOf(++countCreatedThreads).toString());
            this.start();
        }

    }
}