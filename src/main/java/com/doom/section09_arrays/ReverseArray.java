package com.doom.section09_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {

        int[] newArray =  Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < newArray.length / 2; i++) {
            int temp = newArray[i];
            newArray[i] = newArray[newArray.length - i - 1];
            newArray[newArray.length - i - 1] = temp;
        }

        System.out.println("Array = " + Arrays.toString(arr) +  " | Reversed array = " +  Arrays.toString(newArray));
    }
}
