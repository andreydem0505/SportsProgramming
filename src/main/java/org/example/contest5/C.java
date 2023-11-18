package org.example.contest5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < a; i++) {
            set1.add(scanner.nextInt());
        }
        for (int i = 0; i < b; i++) {
            set2.add(scanner.nextInt());
        }
        for (int i = 1; i <= n; i++) {
            if (set1.contains(i))
                System.out.print("1 ");
            else
                System.out.print("2 ");
        }
    }
}
