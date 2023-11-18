package org.example.contest5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        Set<Integer> set1 = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            a1[i] = scanner.nextInt();
            set1.add(a1[i]);
        }
        for (int i = 0; i < n; i++) {
            a2[i] = scanner.nextInt();
            if (a2[i] != a1[i])
                counter++;
        }
        if (counter == 1) {
            for (int i = 0; i < n; i++) {
                if (a1[i] == a2[i])
                    System.out.print(a1[i] + " ");
                else {
                    for (int j = 1; j <= n; j++) {
                        if (!set1.contains(j)) {
                            System.out.print(j + " ");
                            break;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (a1[i] == a2[i])
                    System.out.print(a1[i] + " ");
                else {
                    if (set1.contains(a2[i])) {
                        System.out.print(a1[i] + " ");
                    } else {
                        System.out.print(a2[i] + " ");
                        set1.add(a2[i]);
                    }
                }
            }
        }
    }
}
