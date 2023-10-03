package org.example.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        Map<Integer, Integer> sums = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
            if (sum == x)
                count++;
            if (sums.containsKey(sum - x))
                count += sums.get(sum - x);
            if (sums.containsKey(sum))
                sums.put(sum, sums.get(sum) + 1);
            else
                sums.put(sum, 1);
        }
        System.out.println(count);
    }
}
