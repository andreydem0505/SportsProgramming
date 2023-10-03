package org.example.lesson2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Stack<String> stack = new Stack<>();
        Set<String> set = new HashSet<>();
        String element;
        for (int i = 0; i < n; i++) {
            element = scanner.nextLine();
            stack.add(element);
            set.add(element);
        }
        while (stack.size() > 0) {
            element = stack.pop();
            if (set.contains(element)) {
                System.out.println(element);
                set.remove(element);
            }
        }
    }
}
