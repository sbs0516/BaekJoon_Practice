package `for`

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    val x = nextInt()
    for(i in 1..n) {
        val a = nextInt()
        if(a<x) {
            print("$a ")
        }
    }
}