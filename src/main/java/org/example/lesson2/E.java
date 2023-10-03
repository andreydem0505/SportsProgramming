package org.example.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        Map<String, String> map = new HashMap<>();
        String old, _new;
        for (int i = 0; i < n; i++) {
            old = scanner.next();
            _new = scanner.next();
            if (map.containsKey(old)) {
                map.put(_new, map.get(old));
                map.remove(old);
            } else {
                map.put(_new, old);
            }
        }
        System.out.println(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
