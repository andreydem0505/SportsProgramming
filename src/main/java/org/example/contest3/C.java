package org.example.contest3;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    static int l, r, n;
    static int[] a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        l = 0;
        r = 0;
        moveRight();
        int length = r - l + 1;
        for (int i = 0; i < n - 1; i++) {
            l++;
            moveRight();
            length = Math.max(length, r - l + 1);
        }
        System.out.println(length);
    }

    static void moveRight() {
        while (a[r] - a[l] <= 5 && r < n - 1) {
            r++;
        }
        if (a[r] - a[l] > 5) {
            r--;
        }
    }
}
