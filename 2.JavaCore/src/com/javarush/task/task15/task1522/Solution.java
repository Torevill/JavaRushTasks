package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if(string.equalsIgnoreCase(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        }
        else if (string.equalsIgnoreCase(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        }
        else if (string.equalsIgnoreCase(Planet.MOON)){
            thePlanet = Moon.getInstance();
        }
        else{
            thePlanet = null;
        }
    }
}
