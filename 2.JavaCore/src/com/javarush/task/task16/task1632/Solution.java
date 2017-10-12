package com.javarush.task.task16.task1632;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static{
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while(true){}
        }

    }
    public static class Thread2 extends Thread{
        @Override
        public void run() {
            try{
                while(true){
                    Thread.sleep(1);
                }
            }
            catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Thread3 extends Thread{
        @Override
        public void run() {

            try {
                while(true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        @Override
        public void showWarning() {
            flag = false;
        }
        boolean flag = true;
        @Override
        public void run() {
            while(flag){
            }
        }
    }
    public static class Thread5 extends Thread{
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            while(true){
                String ask = scanner.nextLine();
                if (ask.equalsIgnoreCase("n")){
                    System.out.println(sum);
                    break;
                }
                sum += Integer.parseInt(ask);
            }
        }
    }

}