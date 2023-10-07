package org.example.contest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (scanner.nextInt() == 1) {
                    list.add(j);
                    sum++;
                }
            }
            if (sum == s) {
                System.out.println(0);
                continue;
            }
            int start = 0;
            int end = s - 1;
            int min, len;
            if (end < list.size()) {
                len = list.get(end) - list.get(start) + 1;
                min = n - len - (start == 0 ? list.get(0) : list.get(start) - list.get(start - 1) - 1) - (end == list.size() - 1 ? (n - list.get(list.size()-1) - 1) : list.get(end + 1) - list.get(end) - 1);
            } else {
                System.out.println(-1);
                continue;
            }
            while (end < list.size() - 1) {
                start++;
                end++;
                len = list.get(end) - list.get(start) + 1;
                min =  Math.min(min, n - len - (start == 0 ? list.get(0) : list.get(start) - list.get(start - 1) - 1) - (end == list.size() - 1 ? (n - list.get(list.size()-1) - 1) : list.get(end + 1) - list.get(end) - 1));
            }
            System.out.println(min);
        }
    }
}
