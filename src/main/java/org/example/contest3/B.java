package org.example.contest3;

import java.util.Scanner;

public class B {
    static int l, r, sum, t, n;
    static int[] a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        t = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        l = 0;
        r = 0;
        sum = a[0];
        moveRight();
        int length = r - l + 1;
        for (int i = 0; i < n - 1; i++) {
            sum -= a[l];
            l++;
            moveRight();
            length = Math.max(length, r - l + 1);
        }
        System.out.println(length);
    }

    static void moveRight() {
        while (sum <= t && r < n - 1) {
            r++;
            sum += a[r];
        }
        if (sum > t) {
            sum -= a[r];
            r--;
        }
    }
}
