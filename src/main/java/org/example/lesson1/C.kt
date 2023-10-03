package org.example.lesson1


fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val input = readLine()!!.split(" ").map{it.toInt()}.toTypedArray()
        val f = input[0]
        val m = input[1]
        val r = input[2]
        val c = input[3]
        val array = arrayOfNulls<String>(f)
        for (i in 1..f) {
            array[i-1] = readLine()!!
        }
        if (array[r-1]!![c-1] == 'B')
            println(0)
        else {
            var found = false
            for (i in 1..f) {
                if (i != r && array[i-1]!![c-1] == 'B') {
                    println(1)
                    found = true
                    break
                }
            }
            if (!found) {
                for (i in 1..m) {
                    if (i != c && array[r-1]!![i-1] == 'B') {
                        println(1)
                        found = true
                        break
                    }
                }
            }
            if (!found) {
                for (i in 1..f) {
                    for (j in 1..m) {
                        if (i != r && j != c) {
                            if (array[i-1]!![j-1] == 'B' && !found) {
                                println(2)
                                found = true
                                break
                            }
                        }
                    }
                }
                if (!found)
                    println(-1)
            }
        }
    }
}