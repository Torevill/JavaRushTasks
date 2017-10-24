package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность

Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> countSame = new ArrayList<>();
        int count = 1;
        int num = 0;
        int tempNum = 0;
        int max = 1;

        for (int i = 0; i < 10; i++) {
            tempNum = num;
            num = Integer.parseInt(bf.readLine());
            list.add(num);
            if (num == tempNum) {
                count++;
                if (i == 9) countSame.add(count);
            } else if (count != 1) {
                countSame.add(count);
                count = 1;
            }
        }
        for (int i = 0; i < countSame.size(); i++) {
            if (countSame.get(i) > max) max = countSame.get(i);
        }
        System.out.println(max);
    }

    }
