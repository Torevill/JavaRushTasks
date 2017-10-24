package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/*
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String person = fileScanner.nextLine();
            String [] s = person.split(" ");
            String firstName = s[1];
            String middleName = s[2];
            String lastName = s[0];
            Date birthDate = new Date(Integer.parseInt(s[5]),Integer.parseInt(s[4]),Integer.parseInt(s[3]));
            return new Person(firstName,middleName,lastName,birthDate);
        }

        @Override
        public void close() throws IOException {
        fileScanner.close();
        }


    }
}
