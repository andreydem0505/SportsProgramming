package org.example.lesson1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()
    repeat(t) {
        val a = scanner.nextLong()
        val b = scanner.nextLong()
        val n = scanner.nextLong()
        val m = scanner.nextLong()
        if (a * m < b * (m + 1)) {
            println(a * m * (n / (m + 1)) + n % (m + 1) * a.coerceAtMost(b))
        } else
            println(n * b)
    }
}