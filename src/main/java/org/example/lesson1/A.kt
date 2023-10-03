package org.example.lesson1

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    val list = listOf(a, b, c, d).sorted()
    print(
        if (list[0] == list[1] && list[2] == list[3])
        if (list[1] == list[2])
            "square"
        else
            "rectangle"
    else
        "ugly"
    )
}