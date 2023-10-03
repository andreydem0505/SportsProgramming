package org.example.lesson1

fun main() {
    val s = readLine()!!
    var counter = 1
    for (i in 1 until s.length) {
        if (s[i] != s[i-1])
            counter += 1
    }
    print(counter)
}