package org.example.dynamic;

import java.util.Scanner;

public class Backpack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] r = new int[s+1];
        r[0] = 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = s; j >= a[i]; j--) {
                if (r[j - a[i]] == 1) {
                    r[j] = 1;
                    max = Math.max(max, j);
                }
            }
        }
        System.out.println(max);
    }
}
