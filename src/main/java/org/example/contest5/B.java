package org.example.contest5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.substring(1, s.length() - 1);
        if (s.length() > 0) {
            Set<Character> set = new HashSet<>();
            for (String c : s.split(", ")) {
                set.add(c.charAt(0));
            }
            System.out.println(set.size());
        } else
            System.out.println(0);
    }
}
