package org.example.binary_search;

import java.util.Scanner;

public class C {
    private static Scanner scanner;
    private static int n;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        check(1, n + 1);
    }

    private static void check(int l, int r) {
        int m = (l + r) / 2;
        System.out.println("? " + m);
        System.out.flush();
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("? " + (m == 1 ? n : m - 1));
        System.out.flush();
        int y = Integer.parseInt(scanner.nextLine());
        if (x < y) {
            System.out.println("! " + (m - 1));
        }
    }
}
