package org.example.contest3;

import java.util.Scanner;

public class D {
    static int l, r, sum, k, n;
    static int[] a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        l = 0;
        r = 0;
        sum = a[0];
        moveRight();
        int bestL = 0;
        int bestR = r;
        int res = r - l + 1;
        for (int i = 0; i < n - 1; i++) {
            sum -= a[l];
            l++;
            moveRight();
            if (length() > res) {
                res = length();
                bestL = l;
                bestR = r;
            }
        }
        System.out.println(res);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i < bestL || i > bestR) {
                stringBuilder.append(a[i]);
                stringBuilder.append(" ");
            } else
                stringBuilder.append("1 ");
        }
        System.out.println(stringBuilder);
    }

    static void moveRight() {
        while (length() <= sum + k && r < n - 1) {
            r++;
            sum += a[r];
        }
        if (length() > sum + k) {
            sum -= a[r];
            r--;
        }
    }

    static int length() {
        return r - l + 1;
    }
}
