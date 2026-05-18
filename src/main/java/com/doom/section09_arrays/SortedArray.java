package com.doom.section09_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void reverseArraySorted(int arraySize) {
        printArray(sortIntegers(getIntegers(arraySize)));
    }

    private static int[] getIntegers(int arraySize) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " content " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] a) {
        int[] sortedArray = Arrays.copyOf(a, a.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
