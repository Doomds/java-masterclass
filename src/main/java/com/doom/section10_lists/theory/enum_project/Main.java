package com.doom.section10_lists.theory.enum_project;

import java.time.DayOfWeek;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DayOfTheWeek dow = DayOfTheWeek.TUES;

        for (int i = 0; i < 10; i++) {
            dow = getRandomDay();
            System.out.printf("Name is %s and ordinal is %s\n",
                    dow.name(),
                    dow.ordinal());
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
