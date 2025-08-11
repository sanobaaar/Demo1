package com.example;

public class Main {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Hello world!");
        System.out.println("Number is " + number);
        double numDoub = (double) number;
        System.out.println(numDoub);

        if (number > 1500) {
            System.out.println(number + " is greater than hundred");

        } else {
            System.out.println(number + " is lesser than 100");

        }

        switch (number) {
            case 1:
                System.out.println("Number is odd");

                break;
            case 2:
                System.out.println("Number is even");
                break;

            default:
                break;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int j = 0;

        while (j <= 5) {
            System.out.println(j);
            j++;

        }

        int k = 10;

        do {
            System.out.println(k);
            k++;

        } while (k < 15);

        int a = 23;

    }
}