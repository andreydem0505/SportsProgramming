package org.example.lesson2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\+");
        int a = 0, b = 0, c = 0;
        for (String s : array) {
            if (s.equals("1"))
                a++;
            else if (s.equals("2"))
                b++;
            else
                c++;
        }
        for (int i = 0; i < a; i++) {
            if (b == 0 && c == 0 && i == a - 1)
                System.out.print("1");
            else
                System.out.print("1+");
        }
        for (int i = 0; i < b; i++) {
            if (c == 0 && i == b - 1)
                System.out.print("2");
            else
                System.out.print("2+");
        }
        for (int i = 0; i < c; i++) {
            if (i == c - 1)
                System.out.print("3");
            else
                System.out.print("3+");
        }
    }
}
