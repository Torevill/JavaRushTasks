package com.javarush.task.task15.task1513;

/* 
Максимально простой код-3
*/

public class Solution {
    public static void main(String[] args) {
    Cat cat = new Cat();
        System.out.println(cat.a + " " + cat.b + " " + cat.c);
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {

    }

    public class Car extends Machine {

    }

    public static class Cat
    {
        public int a = getSum();
        public int b = getSum() - a;
        public int c = getSum() - a - b;

        public int getSum()
        {
            return a + b + c;
        }
    }
}
