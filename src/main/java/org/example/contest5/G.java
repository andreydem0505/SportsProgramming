package org.example.contest5;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxW = scanner.nextInt();
        int maxH = scanner.nextInt();
        int minW = 0, minH = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            char c = scanner.next().charAt(0);
            int v = scanner.nextInt();
            if (c == 'H') {
                if (v < maxH) {
                    if (v - minH > maxH - v) {
                        maxH = v;
                    } else {
                        minH = v;
                    }
                }
            } else {
                if (v < maxW) {
                    if (v - minW > maxW - v) {
                        maxW = v;
                    } else {
                        minW = v;
                    }
                }
            }
            System.out.println((maxH - minH) * (maxW - minW));
        }
    }
}
