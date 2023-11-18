package org.example.dynamic;

import java.util.Scanner;

public class Strip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] ar = new int[n+1];
        if (a <= n)
            ar[a] = 1;
        if (b <= n)
            ar[b] = 1;
        if (c <= n)
            ar[c] = 1;
        for (int i = Math.min(Math.min(a, b), c) + 1; i <= n; i++) {
            int x = Math.max(Math.max(ar[Math.max(i - a, 0)], ar[Math.max(i - b, 0)]), ar[Math.max(i - c, 0)]);
            if (x >= ar[i] && x != 0)
                ar[i] = x + 1;
        }
        System.out.println(ar[n]);
    }
}
