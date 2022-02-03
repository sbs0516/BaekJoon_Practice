package `for`

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val a = nextInt()
    for(n in a downTo 1) {
        println(n)
    }
}