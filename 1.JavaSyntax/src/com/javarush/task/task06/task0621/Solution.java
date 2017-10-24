package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек

Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfName = reader.readLine();
        Cat grandf = new Cat(grandfName);

        String grandmName = reader.readLine();
        Cat grandm = new Cat(grandmName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName);
        father.father = grandf;

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName);
        mother.mother = grandm;

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, mother, father);

        System.out.println(grandf);
        System.out.println(grandm);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        public void setMother(Cat mother) {
            this.mother = mother;
        }

        public void setFather(Cat father) {
            this.father = father;
        }

        public String getName() {
            return name;
        }

        public Cat getMother() {
            return mother;
        }

        public Cat getFather() {
            return father;
        }


        @Override
        public String toString() {
            if (mother == null && father == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (mother != null && father != null) {
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            } else if (mother != null) {
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            }
            else{
                return "Cat name is " + name + ", no mother, father is " + father.name;
            }

        }
    }

}
