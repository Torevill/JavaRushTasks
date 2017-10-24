package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> answ = new HashMap<>();
        answ.put("фамилия1", "имя1");
        answ.put("фамилия1", "имя2");
        answ.put("фамилия3", "имя3");
        answ.put("фамилия4", "имя3");
        answ.put("фамилия5", "имя5");
        answ.put("фамилия6", "имя6");
        answ.put("фамилия7", "имя7");
        answ.put("фамилия8", "имя8");
        answ.put("фамилия9", "имя9");
        answ.put("фамилия10", "имя10");
        return answ;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
