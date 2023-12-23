package org.example.combinatorics;

import java.util.Scanner;

public class C {
    private static long fastPow(long num, long pow, int M) {
        if (pow == 0)
            return 1;
        if (pow % 2 == 0) {
            long res = fastPow(num, pow / 2, M);
            return (res * res) % M;
        }
        return (num * fastPow(num, pow - 1, M)) % M;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = 1_000_000_007;
        long[] factorial = new long[1_000_001];
        factorial[1] = 1;
        for (int i = 2; i < 1_000_001; i++) {
            factorial[i] = (factorial[i - 1] * i) % M;
        }
        int m = scanner.nextInt();
        int n, k;
        for (int i = 0; i < m; i++) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            System.out.println(factorial[n] * fastPow((factorial[k] * factorial[n - k]) % M, M - 2, M) % M);
        }
    }
}
