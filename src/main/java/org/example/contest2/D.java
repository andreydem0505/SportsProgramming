package org.example.contest2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        int number;
        String string;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            set.clear();
            number = Integer.parseInt(scanner.nextLine());
            string = scanner.nextLine();
            int res = 0;
            for (char c : string.toCharArray()) {
                res++;
                if (set.add(c)) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
