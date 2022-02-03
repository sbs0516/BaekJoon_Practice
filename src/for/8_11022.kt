package `for`

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val a = nextInt()
    for(n in 1..a) {
        val a = nextInt()
        val b = nextInt()
        println("Case #$n: $a + $b = ${a+b}")
    }
}