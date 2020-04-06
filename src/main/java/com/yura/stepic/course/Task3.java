package com.yura.stepic.course;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        int m = scanner.nextInt();
        int period = 0;

        List<Integer> fibNumbers = new ArrayList<>(Arrays.asList(0, 1));

        for (int i = 2, limit = m * 6 + 1; i <= limit; i++) {
            fibNumbers.add((fibNumbers.get(i - 1) + fibNumbers.get(i - 2)) % m);

            if (fibNumbers.get(i) == 1 && fibNumbers.get(i - 1) == 0) {
                period = fibNumbers.size() - 2;
                break;
            }
        }

        if (period == 0) {
            System.out.println(n.mod(BigInteger.valueOf(m)));
        } else {
            System.out.println(fibNumbers.get(n.mod(BigInteger.valueOf(period)).intValue()));
        }
    }
}
