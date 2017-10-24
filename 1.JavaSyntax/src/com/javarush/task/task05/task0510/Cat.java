package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        age = 10;
        weight = 5;
        address = null;
        color = "red";
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        address = null;
        color = "red";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        weight = 5;
        address = null;
        color = "red";
    }
    public void initialize(int weight, String color){
        name = null;
        age = 10;
        this.weight = weight;
        address = null;
        this.color = color;
    }
    public void initialize(int weight, String color, String address){
        name = null;
        age = 10;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
