package lec4연산자

import com.lannstark.lec04.JavaMoney

fun main () {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(2_000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다") // 객체를 비교할때 자동으로 compareTo를 호출해 줌
    }

    // 동등성 : 두 객체의 값이 같은가
    // 동일성 : 완전히 동일한 객체인가? 즉 주소가 같은가
    // 자바는 동일성에 == 동등성에 equals
    // 코틀린은 동일성에 === 동등성에 == ==만 적으면 간접적으로 equals 호출해 줌

    val money3 = Money(1_000L)
    val money4 = Money(2_000L)
    println(money3 + money4) // 코틀린은 객체마다 연산자를 정의할 수 있다
}