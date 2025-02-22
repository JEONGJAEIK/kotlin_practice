package lec16다양한함수

import com.lannstark.lec16.Person

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A","B", 100)
    person.nextYearAge()
}

// 확장함수
// 확장함수는 클래스에 있는 private나 protected 멤버를 가져올 수 없다
// fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {
// this를 이용해 실제 lec9클래스 안의 값에 접근}
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 확장함수와 멤버함수의 시그니처가 동일하면 멤버함수가 우선 호출
fun Person.nextYearAge(): Int {
    println("확장 lec8함수")
    return this.age + 1
}

// 확장함수는 현재 타입을 기준으로 호출된다
// 자바에서 스태틱 함수를 쓰는 것 처럼 코틀린의 확장함수를 쓸 수 있다
// lec8함수 호출 방식을 바꿔주는 infix lec8함수 존재
// 함수를 복사 붙여넣기하는 inline lec8함수 존재
// 코틀린에는 lec8함수 안에 함수를 선언가능하고 지역함수라고 부름