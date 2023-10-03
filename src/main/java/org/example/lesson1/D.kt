package org.example.lesson1

fun main() {
    val n = readLine()!!
    var s = 0
    for (i in 0..n.lastIndex) {
        s += Integer.parseInt(n[i].toString())
    }
    var r = ""
    while (s >= 9) {
        r += "9"
        s -= 9
    }
    r += s
    if (n == "0" || n == "999999999")
        print(-1)
    else if (r == n) {
        print(r + "0")
    } else {
        if (Integer.parseInt(r) > 1000000000)
            print(-1)
        else
            print(r)
    }
}