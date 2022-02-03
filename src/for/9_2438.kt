package `for`

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val a = nextInt()
    for(n in 1..a) {
        for(j in 1..n) {
            print("*")
        }
        println()
    }
}