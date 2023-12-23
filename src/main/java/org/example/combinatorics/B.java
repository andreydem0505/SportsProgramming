package org.example.combinatorics;

import java.math.BigInteger;
import java.util.Scanner;

public class B {
    private static BigInteger pow(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            res = res.multiply(BigInteger.TWO);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger res = BigInteger.ZERO;
        for (int i = 1; i <= n; i++) {
            res = res.add(pow(i));
        }
        System.out.println(res);
    }
}
