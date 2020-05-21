
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

class Person (var name:String, val birthYear:Int) {
    // 클래스를 선언하는 동시에 생성자도 선언
    init {println("init : $name")}

    constructor(name:String) : this(name, 1997) {println("Sub_init : $name")}// 보조 생성자, 기본 생성자를 호출

    fun introduce() { println("Hi") }
}

open class Animal (var name:String, var age:Int, var type:String) {
    fun introduce() {
        println("${type}, ${name}, ${age}")
    }
}

class Dog(name:String, age:Int) : Animal (name, age, "Dog") {
    fun bark() { println("Bark Bark") }
}

class Cat(name:String, age:Int) : Animal (name, age, "Cat") {
    fun meow() { println("meow meow") }
}

// 오버러아드
open class Aniaml_override {
    open fun eat() { println("Eat !") } // 오버라이드 가능
}

class Tiger : Aniaml_override() {
    override fun eat() { println("호랑이가 먹음") }
}

// 추상 클래스 > 생성자 가질 수 있음
abstract class Animal_abstract {
    abstract fun eat()
    fun sniff() { println("킁킁")}
}

class Rabbit : Animal_abstract() {
    override fun eat() { println("당근 당근") }
}

// 인터페이스(속성 + 추상함수 + 일반함수) > 생성자 가질 수 없음
// 구현부가 있는 함수 > Open 함수로 간주 / 구현부가 없는 함수 > abstrack 함수로 간주
// 한번에 여러 인터페이스 상속 가능

interface Runner { fun run() }
interface Eater { fun eat() {println("음식을 먹음")} }

class Duck : Runner, Eater {
    override fun run() { println("뛴다 뛴다 뛴다") }
    override fun eat() { println("오리가 먹는다") }
}

// 고차함수
fun a (str:String) { println("$str 함수 a") }
fun b (function: (String)->Unit) {function("b가 호출한") }

// 스코프함수
class Book(var name: String, var price: Int)
{
    fun discount()
    {
        price -= 2000
    }
}

// 오브젝트는 그 자체로 객체이며, 생성자를 사용하지 않는다.
object Counter {
    var count = 0

    fun countUp() { count++ }
    fun clear() { count = 0 }
}

class FoodPoLL (val name: String) {
    companion object { var total = 0 }

    var count = 0

    fun vote() {
        total++
        count++
    }
}