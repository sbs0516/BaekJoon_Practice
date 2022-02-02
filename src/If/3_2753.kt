package If

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val a = nextInt()
    if(a%4 == 0) {
        if(a%400==0) {
            print("1")
        } else {
            if(a%100==0) {
                print("0")
            } else {
                print("1")
            }
        }
    } else {
        print("0")
    }
}