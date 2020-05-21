fun main() {
    /* 배열 선언 */
    var intArr  = arrayOf(1,2,3,4,5)
    var nullArr = arrayOfNulls<Int>(5)

    intArr[2] = 9
    println(intArr[2])

    /* 함수 */
    // fun add_1(a: Int, b: Int, c: Int): Int { return a + b + c }
    // fun add_2(a: Int, b: Int, c: Int): Int = a + b + c
    println(add_1(5,6,7))
    println(add_2(5,6,7))

    /* 조건문 */
    var a: Int = 7

    if(a > 10) {
        println("a > 10")
    } else {
        println(" a < 10")
    }

    dowhen(1)
    dowhen("Hoon")
    dowhen(12L)
    dowhen(3.12123)
    dowhen("Kotlin")

}

fun add_1(a: Int, b: Int, c: Int): Int { return a + b + c }
fun add_2(a: Int, b: Int, c: Int): Int = a + b + c
fun dowhen (a: Any) {
    var result = when(a) {
        1          -> println("a = 1")  // 동작
        "Hoon"     -> "Hoon !!" // 리턴
        is Long    -> println("It's Long Type")
        !is String -> println("It's not String Type")
        else       -> println("Not satisfied")
    }
    println(result)
}



