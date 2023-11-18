package org.example.contest4;

import java.util.Scanner;

public class D {
    static int[] a;
    static int k, n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        a = new int[n];
        int minDif = Integer.MAX_VALUE;
        a[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            a[i] = scanner.nextInt();
            minDif = Math.min(minDif, a[i] - a[i-1]);
        }
        System.out.println(binarySearch(minDif-1, a[n - 1] - a[0]+1));
    }

    static int check(int x) {
        int res = 1;
        int lastIndex = 0;
        boolean success = false;
        for (int i = 1; i < n; i++) {
            if (a[i] - a[lastIndex] <= x) {
                if (a[i] - a[lastIndex] == x)
                    success = true;
                lastIndex = i;
                res++;
            }
        }
        if (res == k && success)
            return 0;
        else if (res == k && !success)
            return -1;
        else if (res < k)
            return 1;
        else
            return -1;
    }

    static int binarySearch(int left, int right) {
        System.out.println(left + " " + right);
        int m = (left + right) / 2;
        int res = check(m);
        if (res == 0)
            return m;
        else if (res == 1)
            return binarySearch(m, right);
        return binarySearch(left, m);
    }
}
