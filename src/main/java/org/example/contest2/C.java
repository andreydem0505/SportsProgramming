package org.example.contest2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.next());
        int n;
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        String input;
        for (int i = 0; i < t; i++) {
            set1.clear();
            set2.clear();
            n = Integer.parseInt(scanner.next());
            int res1 = 3 * n, res2 = 3 * n, res3 = 3 * n;
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < n; j++) {
                    input = scanner.next();
                    if (k == 0) {
                        set1.add(input);
                    } else if (k == 1) {
                        if (set1.contains(input)) {
                            res1 -= 2;
                            res2 -= 2;
                        }
                        set2.add(input);
                    } else {
                        if (set1.contains(input) && set2.contains(input)) {
                            res1--;
                            res2--;
                            res3 -= 3;
                        } else if (set1.contains(input)) {
                            res1 -= 2;
                            res3 -= 2;
                        } else if (set2.contains(input)) {
                            res2 -= 2;
                            res3 -= 2;
                        }
                    }
                }
            }
            System.out.println(res1 + " " + res2 + " " + res3);
        }
    }
}
