package If

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    if(a>b) {
        print(">")
    } else if(a<b) {
        print("<")
    } else {
        print("==")
    }
}