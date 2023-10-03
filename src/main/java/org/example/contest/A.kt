package org.example.contest

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val k = scanner.nextInt()
    val a = IntArray(n / k)
    repeat(n / k) {
        a[it] = scanner.nextInt()
    }
    val b = IntArray(n / k)
    repeat(n / k) {
        b[it] = scanner.nextInt()
    }
    var res = 1
    val max = "9".repeat(k).toInt()
    repeat(n / k) {
        var x = max / a[it]
        if (b[it] != 0)
            x++
        for (i in (b[it].toString() + "0".repeat(k-1)).toInt()..(b[it].toString() + "9".repeat(k-1)).toInt()) {
            if (i % a[it] == 0 && i != 0)
                x--
        }
        if (x > 0)
            res *= x
    }
    println(res % (1_000_000_007))
}