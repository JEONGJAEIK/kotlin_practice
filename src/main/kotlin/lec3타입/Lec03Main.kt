package lec3타입

import com.lannstark.lec03.Person

fun main() {
    val number1 : Int? = 10
    val number2 : Long = number1?.toLong() ?: 0L //Int가 null이 들어갈수 있을때 Long에 넣으려면 null일수도
                                                //있기 때문에 null처리 해줘야 함

    val person = Person("정재익", 100)
    println("이름 : ${person.name}")

    val person2 = "재익"
    println("이름 : $person2")

    val person3 = """ 
        ABC
        EFG
        ${person2}
    """.trimIndent()
    println(person3)

    val str = "ABC"
    println(str[0])
    println(str[1])
    println(str[2])
}

fun printAgeIfPerson(obj : Any) {
    if (obj is Person) { //is는 자바의 instanceof과 같은 의미 obj가 Person 타입이라면 true 아니면 false
        val person = obj as Person //as Person은 자바의 (Person) obj로 obj를 Person 타입으로 간주한다는 뜻 (생략 가능)
        println(person.age) // 자바에서는 생략불가 자바에서는 무조건 (Person) obj 해줘야함 (스마트 캐스트)
    }                       //!is is의 반대, as? null이 아니면 Person 변환 null이면 전체가 null
}

//Any는 자바의 Object 레퍼런스타입뿐만아니라 프리미티브 타입의 최상위
//null을 표현할 수 없어 null도 넣을려면 Any?
//equls / hashCode / toString 존재

// Unit 자바의 void와 동일
// void와 다르게 Unit은 그 자체로 lec3타입 인자로 사용 가능

// Nothing 함수가 정상적으로 끝나지 않았다는 걸 표현
// 무조건 예외를 반환하는 lec8함수 / 무한 루프 lec8함수 등