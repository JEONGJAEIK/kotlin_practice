package lec1변수

import com.lannstark.lec01.Person

fun main() {
    var number1 = 10L // 가변 var
    number1 = 5L

    val number2 = 10L // 불변 val

    var number3 : Long // 초기화 되지 않으면 lec3타입 필수

    var number4 : Long? = 10L
    number4 = null // null 넣고 싶으면 lec3타입? 사용

    var person = Person("정재익") // 인스턴스 new 필요 없음
}