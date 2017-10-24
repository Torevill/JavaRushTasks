package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args)
    {
        System.out.println("Program starts");

        try
        {
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After method1 calling. Never will be shown");
        }
        catch (Exception e)
        {
            System.out.println("Exception has been caught");
        }

        System.out.println("Program is still running");
    }

    public static void method1()
    {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }

    /* public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String message = "";

        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        message += element[2].getClassName() + ": ";
        message += element[2].getMethodName() + ": ";
        message += s;


        System.out.println(message);*/
    }

