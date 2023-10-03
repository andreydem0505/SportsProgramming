package org.example.binary_search;

import java.util.Scanner;

public class A {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        check(1, n + 1);
    }

    private static void check(int l, int r) {
        if (l == r - 1) {
            System.out.print("! " + l);
            System.out.flush();
            return;
        }
        int m = (l + r) / 2;
        System.out.println(m);
        System.out.flush();
        String input = scanner.nextLine();
        if (input.equals("<")) {
            check(l, m);
        } else check(m, r);
    }
}