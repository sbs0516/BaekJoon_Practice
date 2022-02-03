package `for`

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val t = nextInt()
    for(n in 1..t) {
        val a = nextInt()
        val b = nextInt()
        println("${a+b}")
    }
}