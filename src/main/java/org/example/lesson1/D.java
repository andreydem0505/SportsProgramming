package org.example.lesson1;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int s = 0;
        for (int i = 0; i < n.length(); i++) {
            s += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        String r = "";
        while (s >= 9) {
            r += "9";
            s -= 9;
        }
        r += s;
        if (n.equals("0") || n.equals("999999999") || Integer.parseInt(r) > 1000000000) {
            System.out.println(-1);
        } else if (r.equals(n)) {
            if (r.length() < 9)
                System.out.println(r + "0");
            else
                System.out.println(r.substring(0, 7) + r.charAt(8) + r.charAt(7));
        } else {
            System.out.println(r);
        }
    }
}
