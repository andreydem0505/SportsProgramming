package org.example.dynamic;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max = 0;
        int sum = 0;
        int maxSum = 0;
        int minSum = 0;
        int l = 1, r = 1;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum > maxSum) {
                maxSum = sum;
                r = i + 1;
            }
            if (minSum > sum) {
                minSum = sum;
                l = i + 1;
            }
            max = Math.max(max, maxSum - Math.min(minSum, 0));
        }
        if (l > r)
            l = 1;
        System.out.println(l + " " + r);
    }
}
