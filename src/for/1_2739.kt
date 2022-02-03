package `for`

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val a = nextInt()
    for(n in 1..9) {
        println("$a * $n = ${a*n}")
    }
}