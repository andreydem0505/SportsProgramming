package org.example.contest4;

import java.util.Scanner;

public class C {
    static double a, b, c, d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        if (check(Float.MAX_VALUE) > 0)
            System.out.printf("%f", binaryUp(-Float.MAX_VALUE, Float.MAX_VALUE));
        else
            System.out.printf("%f", binaryDown(-Float.MAX_VALUE, Float.MAX_VALUE));
    }

    private static double check(double x) {
        return a * x * x * x + b * x * x + c * x + d;
    }

    private static double binaryUp(double left, double right) {
        double m = (left + right) / 2;
        double res = check(m);
        if (Math.abs(right - left) < 0.0000001) {
            return m;
        }
        if (res < 0.) {
            left = m;
        } else
            right = m;
        return binaryUp(left, right);
    }

    private static double binaryDown(double left, double right) {
        double m = (left + right) / 2;
        double res = check(m);
        if (Math.abs(right - left) < 0.0000001) {
            return m;
        }
        if (res > 0.) {
            left = m;
        } else
            right = m;
        return binaryDown(left, right);
    }
}
