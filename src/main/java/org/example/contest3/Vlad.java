package org.example.contest3;

import java.util.Scanner;

public class Vlad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            books[i] = scanner.nextInt();
        }
        int l = 0, r = l;
        int bestNumber = 0;
        int sum;
        while (l <= n - 1 && r <= n - 1) {
            sum = books[l];
            while (sum + books[r] <= t && r < n - 1) {
                sum += books[r];
                r += 1;
            }
            bestNumber = Math.max(bestNumber, r - l + 1);
            l += 1;
            r = l;
        }
        if (bestNumber == 1 && books[l - 1] > t)
            System.out.println(0);
        else
            System.out.println(bestNumber);
    }
}
