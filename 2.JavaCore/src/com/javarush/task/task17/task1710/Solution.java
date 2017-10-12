package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
-c name sex bd
-u id name sex bd
-d id
-i id
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       if (args[0].equalsIgnoreCase("-c")) {
            if (args[2].equalsIgnoreCase("м")) {
                allPeople.add(Person.createMale(args[1], sdf.parse(args[3])));
                for (Person now : allPeople) {
                    if (now.getName().equalsIgnoreCase(args[1])) {
                        System.out.println(allPeople.indexOf(now));
                    }
                }
            } else {
                allPeople.add(Person.createFemale(args[1], sdf.parse(args[3])));
                for (Person now : allPeople) {
                    if (now.getName().equalsIgnoreCase(args[1])) {
                        System.out.println(allPeople.indexOf(now));
                    }
                }
            }

        } else if (args[0].equalsIgnoreCase("-u")) {
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(sdf.parse(args[4]));
            if (args[3].equalsIgnoreCase("м")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            } else {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            }


        } else if (args[0].equalsIgnoreCase("-d")) {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
        } else if (args[0].equalsIgnoreCase("-i")) {
            Person now = allPeople.get(Integer.parseInt(args[1]));
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(now.getName() + (now.getSex() == Sex.MALE ? " м " : " ж ") + dateFormat.format(now.getBirthDay()));
        }
    }
}
