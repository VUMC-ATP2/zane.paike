package homework;

import javax.swing.*;

public class FirstClass {
    public static void main(String[] args) {

//  3.uzdevums
        String countryName = "Angola";
        System.out.println("My choosen country is " + countryName + ".\n");

        long angolaPopulation = 32870000;
        System.out.printf("In Year 2020 the the population of Angola country was %d people.\n",angolaPopulation);

        double nationalArea = 1.246700d;
        System.out.println("The national area of Angola is " + nationalArea + " km3.");

        String capitalCity = "Luanda";
        System.out.println("And the capital city of Angola is " + capitalCity + "!");

        String mainLanguage = "Portugies";
        System.out.println("People in " + countryName + " mainly talk in " + mainLanguage + ".");

        boolean isEUCountry = false;
        boolean isNotEUCountry = true;

        if (isEUCountry) {
            System.out.println("Yes, Angola is EU country!!");
        } else {
            System.out.println("No, Angola is not EU country!!");
        }

        String moneySymbol = "Kz";
        System.out.println("Money in Angola is caled - Kvanza. The symbol for money is - " + moneySymbol + ".\n");

// 4.uzdevums
        String myName = "Zane";
        String mySentence = "My name is Zane.";
        String mySecoundSentence = "I am a 30 year young woman who lives in Tukums.";
        System.out.printf("%s %s", mySentence, mySecoundSentence);

        String speak = " I speak in";
        byte howMany = 3;
        String languages = "languages!";
        System.out.println(speak + " " + howMany + " " + languages + "\n");


//  5.uzdevums
        int x = 6;
        int y = 9;
        int z = x + y;
        System.out.println(z + "\n");

        int a = 166;
        int b = 555;
        int c = a - b;
        System.out.println(c + "\n");

        int d = 99;
        double e = 0.5;
        double f = d / e;
        System.out.println(f + "\n");

        double l = (c + x) * (a - e);
        System.out.println("l = " + l + "\n");

        int g = 54;
        double h = 1.2;
        double i = g * h;
        System.out.println(i + "\n");

        int m = 6;
        int n = 10;
        int v = n % m;
        System.out.println(v + "\n");

        System.out.println(i + h);
        System.out.println(f / c);
        System.out.println(f - c);
        System.out.println(2 * z);

    }
}
