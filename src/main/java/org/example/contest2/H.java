package org.example.contest2;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[1000];
        int counter = 0;
        for (int i = 1; i <= 1666; i++) {
            if (i % 3 != 0 && i % 10 != 3) {
                array[counter] = i;
                counter++;
            }
        }
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(array[scanner.nextInt() - 1]);
        }
    }
}
