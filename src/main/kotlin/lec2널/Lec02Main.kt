package lec2널

import com.lannstark.lec02.Person

fun main() {
//    val str: String? = null
//    println(str?.length)  //?. 세이프 콜 null이 아니면 뒤엣걸 실행 null 이면 전체가 null
//
//    val str: String? = null
//    println(str?.length ?: 0) //Elvis lec4연산자 str?.length가 null이면 0을 시행

//    println(startsWithA4(null))

    val person = Person(null) //자바의 클래스를 쓸때 Nullable이나 NotNull 어노테이션을 활용안하면 코틀린이
    startsWithPerson(person.name)   //Null 들어갈 수 있는지 판단 불가 런타임때 NPE가 뜨게 됨
}

fun startsWithA1(str : String?) : Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str : String?) : Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str : String?) : Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str : String?) : Boolean {
    return str!!.startsWith("A")  // !! <- 절대 null이 아니라는 뜻
    // 근데 만약 null이 들어오면 컴파일에서는 티가 안나지만 런타임에서 NPE 발생
}

fun startsWithPerson(str : String) : Boolean {
    return str.startsWith("A")
}
