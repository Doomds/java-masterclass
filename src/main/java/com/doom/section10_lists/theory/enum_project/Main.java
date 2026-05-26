package com.doom.section10_lists.theory.enum_project;

import java.time.DayOfWeek;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DayOfTheWeek dow = DayOfTheWeek.TUES;

        for (int i = 0; i < 10; i++) {
            dow = getRandomDay();
            System.out.printf("Name is %s and ordinal is %s\n",
                    dow.name(), dow.ordinal());

            if (dow == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday !!!!");
            }
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }

    public static void switchDay(DayOfTheWeek dow) {
        int weekDayInteger = dow.ordinal() + 1;
        switch (dow) {
            case MON -> System.out.println("Monday is Day " + weekDayInteger);
            case TUES ->  System.out.println("Tuesday is Day " + weekDayInteger);
            case WED -> System.out.println("Wednesday is Day " +  weekDayInteger);
            case THURS -> System.out.println("Thursday is Day " +  weekDayInteger);
            case FRI ->  System.out.println("Friday is Day " +  weekDayInteger);
            case SAT ->  System.out.println("Saturday is Day " +  weekDayInteger);
            case SUN -> System.out.println("Sunday is Day " +  weekDayInteger);
        }
    }
}
