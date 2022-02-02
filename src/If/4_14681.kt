package If

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    if(a>0) {
        if(b>0) {
            print("1")
        } else {
            print("4")
        }
    } else {
        if(b>0) {
            print("2")
        } else {
            print("3")
        }
    }
}