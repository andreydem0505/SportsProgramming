package org.example.contest5;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int u = 0, d = 0, l = 0, r = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'U' -> u++;
                case 'D' -> d++;
                case 'L' -> l++;
                case 'R' -> r++;
            }
        }
        if (Math.abs(u - d) == Math.abs(l - r))
            System.out.println(Math.abs(u - d));
        else if (Math.abs(Math.abs(u - d) - Math.abs(l - r)) % 2 == 0)
            System.out.println(Math.min(Math.abs(u - d), Math.abs(l - r)) + (Math.max(Math.abs(u - d), Math.abs(l - r)) - Math.min(Math.abs(u - d), Math.abs(l - r))) / 2);
        else
            System.out.println(-1);
    }
}
