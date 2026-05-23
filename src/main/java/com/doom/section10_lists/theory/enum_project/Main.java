package com.doom.section10_lists.theory.enum_project;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        DayOfWeek[] dow = DayOfWeek.values();

        for (DayOfTheWeek dow2 : DayOfTheWeek.values()) {
            System.out.printf("Name is %s and ordinal is %s\n",
                    dow2.name(), dow2.ordinal());
        }
    }
}
