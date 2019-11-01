package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {// i = i +1
            System.out.println(i);
        }
        System.out.println("_______________________");
        for (int i = 1; i <= 9; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        System.out.println("__________________________");
        // i = i -1
        for (int j = 9; j > 0; j--) {
            System.out.println("7 x " + j + " = " + (7 * j));
        }
        System.out.println("__________________________");
        int num = 1;
        while (num < 10) {
            System.out.println("Робот" + num);
            num++;
        }
        System.out.println("_________________________");


        String str = "#";
        while (str.length() < 10) {
            str = str + "#";
            System.out.println(str);
        }
        System.out.println("_________________________");
        int limit = 1;
        while (true) {
            System.out.println("hello");
            limit++;
            if (limit == 10) {
                break;
            }
            int[] numbers = {98, 5, 432, 23, 4, 56, 3212312};
            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
            System.out.println(numbers[3]);
            System.out.println(numbers[4]);
            System.out.println(numbers[5]);
            System.out.println(numbers[6]);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
                if (i == 3) {
                    break;
                }
                System.out.println("Privet");

            }

            for (int i = 0; i < 3; i++) {
                System.out.println(i);
                for (int j = 0; j < 5; j++) {
                    System.out.println("hi");

                }

            }
        }
    }
}
