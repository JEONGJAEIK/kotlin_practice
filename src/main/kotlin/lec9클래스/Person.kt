package lec9클래스

fun main() {
    Person() // 두번째 부생성자 부터 호출해도 역순으로 메인에있는 초기화 블록부터 읽어짐
    println("초기화 블록")

}

class Person (
    name: String = "정재익",
    var age: Int = 1
) {
//    val name = name  //커스텀 게터 만들기
//        get() = field.uppercase() // 무한루프를 막기위해서 자기자신을 부르는 예약어 field 사용 (backing field)
    var name = name
        set(value) { //커스텀 세터 만들기
            field = value //value는 밖에서 들어오는 단어
        }
    init { //init (초기화) 블록은 생성자가 호출되는 시점에 호출된다
        if (age <= 0) {
            println("나이는 ${age}일 수 없습니다")
        }
    }
    // 코틀린에서는 부생성자보다 디폴트파라미터를 추천
    // 객체를 다른 객체로 바꾸는 경우 부생성자를 써야하지만 정적 팩토리 메서드 추천
    constructor(name: String) : this(name, 1)  { // 생성자 추가
        println("첫 번째 부생성자")
    }

    constructor() : this("홍길동") {
        println("두 번째 부생성자")
    }

    fun isAdult() : Boolean {
        return this.age >= 20
    }

    val isAdult2 : Boolean //커스텀 게터 방식
        get() = this.age >= 20
}

// 코틀린은 기본이 퍼블릭 생략 가능
// 필드만 만들면 게터 세터 자동으로 만들어줌
// 생성자는 클래스옆에 괄호로 표시 constructor 생략가능
// 프로퍼티 = 필드 + 게터 + 세터
// 클래스의 프로퍼티 선언과 생성자를 동시에 합칠 수 있음
// body에 아무것도 없어서 중괄호 생략 가능
