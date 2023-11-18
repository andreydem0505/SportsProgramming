package org.example.contest4;

import java.util.Scanner;

public class B {
    static int[] a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt() * scanner.nextInt();
            a[i] = sum;
        }
        int[] req = new int[m];
        for (int i = 0; i < m; i++) {
            req[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if (a.length == 1)
                System.out.println(1);
            else
                System.out.println(binarySearch(req[i], 0, n) + 1);
        }
    }

    private static int binarySearch(int x, int left, int right) {
        int m = (left + right) / 2;
        if (x >= a[m]) {
            left = m;
        } else
            right = m;
        if (left == right - 1) {
            if (a[left] >= x)
                return left;
            return right;
        }
        return binarySearch(x, left, right);
    }
}
