package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов","Иван");
        map.put("Петров","Иван");
        map.put("Сидоров","Иван");
        map.put("Ал-ахмед","Петр");
        map.put("Трамп","Димон");
        map.put("Ким","Ин");
        map.put("Курва","Джанко");
        map.put("Бобруйско","Иван");
        map.put("Жан-клод","Петр");
        map.put("МакНил","Иван");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int counter = 0;
        for (String now:map.values()){
            if (now.equals(name)){
                counter++;
            }
        }
    return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        return (map.containsKey(lastName) ? 1:0);

    }

    public static void main(String[] args) {

    }
}
