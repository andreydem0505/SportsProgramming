package org.example.contest

import java.util.Scanner

fun main() {
    val a = IntArray(6)
    val scanner = Scanner(System.`in`)
    repeat(6) {
        a[it] = scanner.nextInt()
    }
    var counter = a[0]
    var res = 0
    while (!(a[1] == -1 && a[5] == -1 && counter / 2 == a[3])) {
        if (a[1] > 0) {
            counter++
            a[1]--
        } else if (a[1] == 0) {
            a[1]--
        } else
            counter--
        if (a[5] > 0) {
            counter++
            a[5]--
        } else if (a[5] == 0) {
            a[5]--
        } else
            counter--
        res += counter
    }
    println(res)
}