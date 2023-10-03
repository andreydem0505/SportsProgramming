package org.example.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
    private static Map<String, Integer> map;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (contains(input)) {
                map.put(input, map.get(input) + 1);
                System.out.println(input + map.get(input));
            } else {
                map.put(input, 0);
                System.out.println("OK");
            }
        }
    }

    private static boolean contains(String element) {
        return map.containsKey(element);
    }
}
