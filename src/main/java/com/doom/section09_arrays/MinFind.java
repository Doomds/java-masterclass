package com.doom.section09_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinFind {
    static void main() {
        int[] newArray = readIntegers();
        System.out.println(Arrays.toString(newArray));

        System.out.println("Le nombre minimum du tableau est : " + findMin(newArray));
    }

    public static int[] readIntegers() {
        int[] array = new int[5];

        System.out.println("Enter 5 integers separated by comma: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.split(",")[i]);
        }

        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }
}
