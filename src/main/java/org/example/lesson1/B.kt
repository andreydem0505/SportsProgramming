package org.example.lesson1

import kotlin.system.exitProcess

fun main() {
    val n = readLine()!!.toInt()
    val list = Array(n) { Array(2) {0} }
    repeat(n) { counter ->
        list[counter] = readLine()!!.split(" ").map{it.toInt()}.toTypedArray()
    }
    repeat(n) { counter1 ->
        repeat(n) { counter2 ->
            if (counter1 != counter2) {
                if (list[counter1][0] + list[counter1][1] == list[counter2][0] && list[counter2][0] + list[counter2][1] == list[counter1][0]) {
                    print("YES")
                    exitProcess(0)
                }
            }
        }
    }
    print("NO")
}