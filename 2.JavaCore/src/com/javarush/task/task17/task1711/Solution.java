package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int counter = 1;
        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
//        if (args[0].equalsIgnoreCase("-c")) {
                    try {
                        while (true) {
                            if (args[counter + 1].equalsIgnoreCase("м")) {
                                allPeople.add(Person.createMale(args[counter], sdf.parse(args[counter + 2])));
                                for (Person now : allPeople) {
                                    if (now.getName().equalsIgnoreCase(args[counter])) {
                                        System.out.println(allPeople.indexOf(now));
                                    }
                                }
                            } else {
                                allPeople.add(Person.createFemale(args[counter], sdf.parse(args[counter + 2])));
                                for (Person now : allPeople) {
                                    if (now.getName().equalsIgnoreCase(args[counter])) {
                                        System.out.println(allPeople.indexOf(now));
                                    }
                                }
                            }
                            counter += 3;

                        }
                    } catch (Exception e) {
                        break;
                    }
                }

            case "-u":
        //} else if (args[0].equalsIgnoreCase("-u")) {
                synchronized (allPeople) {
                    try {
                        while (true) {
                            allPeople.get(Integer.parseInt(args[counter])).setName(args[counter + 1]);
                            allPeople.get(Integer.parseInt(args[counter])).setBirthDay(sdf.parse(args[counter + 3]));
                            if (args[counter + 2].equalsIgnoreCase("м")) {
                                allPeople.get(Integer.parseInt(args[counter])).setSex(Sex.MALE);
                            } else {
                                allPeople.get(Integer.parseInt(args[counter])).setSex(Sex.FEMALE);
                            }
                            counter += 4;

                        }
                    } catch (Exception e) {
                        break;
                    }
                }

        case "-d":
        //} else if (args[0].equalsIgnoreCase("-d")) {
            synchronized (allPeople) {
                try {
                    while (true) {
                        allPeople.get(Integer.parseInt(args[counter])).setName(null);
                        allPeople.get(Integer.parseInt(args[counter])).setBirthDay(null);
                        allPeople.get(Integer.parseInt(args[counter])).setSex(null);
                        counter += 1;

                    }
                } catch (Exception e) {
                    break;
                }
            }
            case "-i":
        //} else if (args[0].equalsIgnoreCase("-i")) {
                synchronized (allPeople) {
                    try {
                        while (true) {
                            Person now = allPeople.get(Integer.parseInt(args[counter]));
                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                            System.out.println(now.getName() + (now.getSex() == Sex.MALE ? " м " : " ж ") + dateFormat.format(now.getBirthDay()));
                            counter += 1;

                        }
                    } catch (Exception e) {
                        break;
                    }
                }
        }
    }
}
