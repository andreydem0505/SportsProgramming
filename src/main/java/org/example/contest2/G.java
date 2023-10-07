package org.example.contest2;

import java.util.Arrays;
import java.util.Scanner;

public class G {
    static long[] d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long h = scanner.nextLong();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextLong();
            }
            long v = (int) Math.ceil((double) h / n);
            d = new long[n];
            long max = 0;
            for (int j = 0; j < n - 1; j++) {
                d[j] = a[j+1] - a[j];
                max = Math.max(max, d[j]);
            }
            d[n-1] = Long.MAX_VALUE;
            d = Arrays.stream(d).sorted().toArray();
            int current = 0;
            boolean success = false;
            while (check(v) < h) {
                v = d[current];
                current++;
                if (current == n) {
                    v += h - check(v);
                    success = true;
                    break;
                }
            }
            if (!success) {
                current -= 2;
                if (current > -1)
                    v = d[current] + 1;
                while (check(v) < h) {
                    v++;
                }
            }
            System.out.println(v);
        }
    }

    static long check(long v) {
        long res = 0;
        for (int j = 0; j < d.length; j++) {
            res += Math.min(v, d[j]);
        }
        return res;
    }
}
