package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Stallone", "Piter");
        map.put("Bush", "Jhon");
        map.put("Ivanov", "Maikl");
        map.put("Oland", "Vadim");
        map.put("Ford", "Jordan");
        map.put("Washington", "Maikl");
        map.put("Jeferson", "Piter");
        map.put("Mugabe", "Mngo");
        map.put("Adenauer", "Wiliam");
        map.put("Dred", "Maikl");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> answ = new ArrayList<>();
        Iterator<HashMap.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
                int counter = 0;
                String temp = it.next().getValue();
                for(String now:map.values()) {
                    if (now.equals(temp)) {
                        counter++;
                    }
                }
                if(counter >= 2){
                    answ.add(temp);
                }
        }
        for(String now:answ){
            removeItemFromMapByValue(map, now);
        }


    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        /*HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);*/

    }
}

 /*if (map.containsValue(it.next().getValue())) {
         String temp = it.next().getValue();
         Iterator<Map.Entry<String, String>> now = map.entrySet().iterator();
        while (now.hasNext()) {
        if (now.next().getValue().equals(temp)) {
        it.remove();
        }
        }
        it.remove();*/