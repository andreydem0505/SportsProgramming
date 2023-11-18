package org.example.contest3;

import java.util.Arrays;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int end = n - 1;
        int start = end;
        while (a[start] * 2 > a[end] && start > 0) {
            start--;
        }
        if (a[start] * 2 < a[end])
            start++;

    }
}
