package org.example.contest4;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    static int[] a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int q = scanner.nextInt();
        int input;
        for (int i = 0; i < q; i++) {
            input = scanner.nextInt();
            if (a.length == 1)
                System.out.println(input >= a[0] ? 1 : 0);
            else
                System.out.println(binarySearch(input, 0, n));
        }
    }

    private static int binarySearch(int x, int left, int right) {
        int m = (left + right) / 2;
        if (x >= a[m]) {
            left = m;
        } else
            right = m;
        if (left == right - 1) {
            if (a[left] > x)
                return left;
            return right;
        }
        return binarySearch(x, left, right);
    } // 3 6 8 10 11
}
