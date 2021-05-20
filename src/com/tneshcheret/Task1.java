package com.tneshcheret;

public class Task1 {

    public static void main(String[] args) {
	/* 1) Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
        - если число кратно 3 то вместо него вывести Hello
        - если число кратно 5 то вместо него вывести World
        - если число кратно и 3 и 5 то вместо него вывести HelloWorld
        */

        printNumbers();
    }

    private static void printNumbers() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.print("HelloWorld ");
            } else {
                if (i % 3 == 0) {
                    System.out.print("Hello ");
                } else {
                    if (i % 5 == 0) {
                        System.out.print("World ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}
