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

    /* 증감연산자 */
    for(i in 0..9) {print(i)}
    println()
    for(i in 0..9 step 3) {print(i)}

    /* 흐름제어*/
    for (i in 1..10) {
        if (i == 3) break // continue도 가능
        println(i)
    }
    // 코틀린에서 추가된 기능 label -> 레이블이 달린 반복문을 기준으로 즉시 break or continue
    loop@for (i in 1..10) {
        for (j in 1..10) {
            println("i : $i, j : $j")
            if(i == 1 && j == 2) break@loop

        }
    }

    /* 클래스 */
    var class_1 = Person("Kim", 1990)
    var class_2 = Person("Tim", 1995)

    var class_3 = Person("KKKK")

    class_1.introduce()
    class_2.introduce()

    var class_4 = Tiger()
    class_4.eat()

    var class_5 = Rabbit()
    class_5.eat()

    var class_6 = Duck()
    class_6.run()
    class_6.eat()

    /* 스코프 */
    // 동일한 스코프내에서 변수 공유 (패키지, {} 등)
    // 하위 스코프내에서는 상위 스코프를 재정의 가능
    // 접근 제어  : public internal private protected
    // ============== 패키지 스코프 ==============
    // public   : 어떤 패키지에서도 접근 가능
    // internal : 같은 모듈 내에서만 접근 가능
    // private  : 같은 파일 내에서만 접근 가능

    // ============== 클래스 스코프 ==============
    // public    : 클래스 외부에서 접근 가능
    // private   : 클래스 내부에서만 접근 가능
    // protected : 클래스 자신과 상속받은 클래스에서 접근 가능

    /* 고차함수 및 람다함수 */
    b(::a)
    var lam: (String)->Unit = { str -> println("$str : 람다 함수") } //파라미터 부분에 자료형을 선언하기 때문에 자료형 추론 가능
    b(lam)

    /* 스코프 함수 */
    // 인스턴스의 속성이나 함수를 좀 더 깔금하게 불러 쓸 수 있음

    // 인스턴스를 생성하자마자 apply를 호충, a.run, with(a)

    // apply/also : 처리가 끝나면 인스턴스 반환
    // run/let    : 처리가 끝나면 최종값을 반환
    // 차이점 : 파라미터를 인스턴스로 넘긴 것 처럼 사용
    var price = 50000

    var class_7 = Book("Hoon_book", 10000).apply {
        name = "[초특가]" + name
        discount()
    }
    println(class_7.price)

    class_7.run { println("name : $name, price : $price")}

    class_7.let { println("name : ${it.name}, price : ${it.price}") }

    /* 오브젝트 */
    // 공통으로 사용할 객체는 오브젝트로 관리
    println(Counter.count)

    Counter.countUp()
    println(Counter.count)

    Counter.clear()
    println(Counter.count)

    var ob_1 = FoodPoLL("짜장")
    var ob_2 = FoodPoLL("짬뽕")

    ob_1.vote()
    ob_1.vote()

    ob_2.vote()
    ob_2.vote()
    ob_2.vote()

    println("total : ${FoodPoLL.total}")
}
