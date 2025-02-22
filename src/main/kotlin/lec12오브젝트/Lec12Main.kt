package lec12오브젝트

import com.lannstark.lec12.Movable

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    // 익명 lec9클래스
    // 자바에서는 new 타입이름() 코틀린에서는 object : 타입이름
    moveSomething(object : Movable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }
    })
}

class Person private constructor(val name: String, val age: Int) {

    // companion object 동반객체도 하나의 객체로 간주 이름도 붙일 수 있고 인터페이스를 구현하는 것도 가능
    // Java에서 코틀린의 companion object를 사용하려면 코틀린쪽에 @JvmStatic 붙여야함

    companion object Factory : Log { // 코틀린은 static 없음 companion object 동행 객체로 사용
        private const val MIN_AGE = 1 // const 런타임시에 숫자부여 진짜 상수 기본타입과 스트링이랑 붙일 수 있음
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 펄슨클래스의 동행객체")
        }
    }

}

// 코틀린에서 싱글톤 만드는법 아래가 끝임
object Singleton {
    var a: Int = 0
}

// 익명 lec9클래스
private fun moveSomething(moveable: Movable) {
    moveable.move()
    moveable.fly()
}