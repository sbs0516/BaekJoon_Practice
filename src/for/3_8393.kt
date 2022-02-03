package `for`

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    var sum = 0
    for(t in 1..n) {
        sum += t
    }
    println(sum)
}