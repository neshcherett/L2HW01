package com.tneshcheret;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        //2) Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно). Вывести среднее арифметическое.

        int[] randomArr = createRandomArray(10);
        System.out.println(Arrays.toString(randomArr));
        System.out.println(getAverage(randomArr));
    }

    private static double getAverage(int[] array) {
        double sumElementsArray = 0;
        for (int j : array) {
            sumElementsArray = sumElementsArray + j;
        }
        return sumElementsArray / array.length;
    }

    private static int[] createRandomArray(int arrayLength) {
        int[] randomArray = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = random.nextInt(10) + 10;
        }
        return randomArray;
    }
}
