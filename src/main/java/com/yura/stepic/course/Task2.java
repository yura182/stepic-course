package com.yura.stepic.course;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] lastDigits = new int[3];

        lastDigits[1] = 0;
        lastDigits[2] = 1;

        System.out.print("0 1 ");
        for (int i = 0, limit = number - 1; i < limit; i++) {
            lastDigits[0] = lastDigits[1];
            lastDigits[1] = lastDigits[2];

            lastDigits[2] = (lastDigits[0] + lastDigits[1]) % 10;
            System.out.print(lastDigits[2] + " ");
        }

        System.out.println();
        System.out.println(lastDigits[2]);
    }
}
