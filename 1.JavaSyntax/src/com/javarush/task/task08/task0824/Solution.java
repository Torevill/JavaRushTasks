package com.javarush.task.task08.task0824;

/* 
Собираем семейство

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> kids = new ArrayList<>();
        ArrayList<Human> mothers = new ArrayList<>();
        ArrayList<Human> fathers = new ArrayList<>();
        ArrayList<Human> none = new ArrayList<>();

        Human kid1 = new Human();
        kid1.sex = true;
        kid1.age = 18;
        kid1.name = "aw";
        kid1.children = none;

        Human kid2 = new Human();
        kid2.sex = true;
        kid2.age = 18;
        kid2.name = "aq";
        kid2.children = none;

        Human kid3 = new Human();
        kid3.sex = true;
        kid3.age = 18;
        kid3.name = "ae";
        kid3.children = none;

        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);

        Human mother = new Human();
        mother.sex = false;
        mother.age = 40;
        mother.name = "ma";
        mother.children = kids;

        mothers.add(mother);

        Human father = new Human();
        father.sex = true;
        father.age = 40;
        father.name = "fa";
        father.children = kids;

        fathers.add(father);

        Human grandPa1 = new Human();
        grandPa1.age = 60;
        grandPa1.name = "Pa1";
        grandPa1.sex = true;
        grandPa1.children = fathers;

        Human grandPa2 = new Human();
        grandPa2.age = 60;
        grandPa2.name = "Pa2";
        grandPa2.sex = true;
        grandPa2.children = mothers;

        Human grandBa1 = new Human();
        grandBa1.age = 60;
        grandBa1.name = "Ba1";
        grandBa1.sex = true;
        grandBa1.children = fathers;

        Human grandBa2 = new Human();
        grandBa2.age = 60;
        grandBa2.name = "Ba2";
        grandBa2.sex = true;
        grandBa2.children = mothers;

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandBa1);
        System.out.println(grandBa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();

            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
