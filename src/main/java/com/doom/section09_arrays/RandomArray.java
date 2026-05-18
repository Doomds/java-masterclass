package com.doom.section09_arrays;

import java.util.Random;

public class RandomArray {
    public static int[] getRandomArray(int arraySize){
        int[] array = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(1000);
        }

        return array;
    }
}
