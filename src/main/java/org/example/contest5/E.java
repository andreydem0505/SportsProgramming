package org.example.contest5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        int x;
        int res = 0;
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            while (!set.add(x)) {
                x++;
                res++;
            }
        }
        System.out.println(res);
    }
}
