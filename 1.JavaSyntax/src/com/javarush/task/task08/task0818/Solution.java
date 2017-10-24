package com.javarush.task.task08.task0818;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Stallone", 100);
        map.put("Bush", 300);
        map.put("Ivanov", 400);
        map.put("Oland", 500);
        map.put("Ford", 600);
        map.put("Washington", 1000);
        map.put("Jeferson", 2000);
        map.put("Mugabe", 3000);
        map.put("Adenauer", 4000);
        map.put("Dred", 6000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        ArrayList<String> answ = new ArrayList<>();
        for (Map.Entry<String , Integer> now:map.entrySet()){
            if (now.getValue() < 500){
                answ.add(now.getKey());
            }
        }
        for (String now:answ){
            map.remove(now);
        }
    }

    public static void main(String[] args) {

    }
}