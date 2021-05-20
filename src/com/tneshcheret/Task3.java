package com.tneshcheret;

public class Task3 {
    public static void main(String[] args) {
       //3) Написать метод который вернет String в которой будут в одну строку числа от 1 до 30. Каждое число при этом взять в круглые скобки ()
        System.out.println(getString());
    }

    private static String getString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 31; i++) {
            stringBuilder.append("(").append(i).append(")");
        }
        return stringBuilder.toString();
    }
}
