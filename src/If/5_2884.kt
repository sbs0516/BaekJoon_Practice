package If

import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val h = nextInt()
    val m = nextInt()
    if(m<45) {
        if(h==0) {
            print("23 ${60-(45-m)}")
        } else {
            print("${h-1} ${60-(45-m)}")
        }
    } else {
        print("$h ${m-45}")
    }
}