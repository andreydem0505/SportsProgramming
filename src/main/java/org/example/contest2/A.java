package org.example.contest2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int input;
        for (int i = 0; i < t; i++) {
            input = scanner.nextInt();
            System.out.println(input / 2 + input % 2);
            int last = -1;
            if (input % 2 == 1) {
                last = input - 1;
                input -= 1;
            }
            for (int j = 0; j < input; j++) {
                if (j % 2 == 0) {
                    System.out.println((j * 3 + 2)+ " " + ((j + 1) * 3 + 3));
                }
            }
            if (last > -1) {
                System.out.print((last * 3 + 1)+ " " + (last * 3 + 2));
            }
            System.out.println();
        }
    }
}
// BANBANBAN
