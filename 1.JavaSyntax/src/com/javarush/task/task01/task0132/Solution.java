package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        Integer num = number;
        String wow = num.toString();
        int s1 = Character.getNumericValue(num.toString().charAt(0));
        int s2 = Character.getNumericValue(num.toString().charAt(1));
        int s3 = Character.getNumericValue(num.toString().charAt(2));
        return s1+s2+s3;
    }
}