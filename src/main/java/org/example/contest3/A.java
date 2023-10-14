package org.example.contest3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int l = 0, r = n - 1;
        int sum = a[l] + a[r];
        if (l == r) {
            System.out.println(-1);
            System.exit(0);
        }
        while (sum != x) {
            if (sum < x)
                l++;
            else
                r--;
            if (l == r) {
                System.out.println(-1);
                System.exit(0);
            }
            sum = a[l] + a[r];
        }
        System.out.println(l + " " + r);
    }
}
