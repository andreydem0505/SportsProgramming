package org.example.combinatorics;

import java.math.BigInteger;
import java.util.Scanner;

public class A {
    private static BigInteger factorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }
        return factorial(n - 1).multiply(BigInteger.valueOf(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] a = new char[n][n];
        BigInteger res = BigInteger.ZERO;
        int counter;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next().toCharArray();
            counter = 0;
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 'C')
                    counter++;
            }
            if (counter >= 2) {
                res = res.add(factorial(counter).divide(factorial(counter - 2).multiply(BigInteger.valueOf(2))));
            }
        }
        for (int j = 0; j < n; j++) {
            counter = 0;
            for (int i = 0; i < n; i++) {
                if (a[i][j] == 'C')
                    counter++;
            }
            if (counter >= 2) {
                res = res.add(factorial(counter).divide(factorial(counter - 2).multiply(BigInteger.valueOf(2))));
            }
        }
        System.out.println(res);
    }
}
