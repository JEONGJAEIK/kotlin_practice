package lec10상속

open class Base(open val number: Int = 100) {
    init {
        println("Base Class")
        println(number) // 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야한다
    }
}




class Derived(override val number: Int) : Base(number) {
    init {
        println("Derived Class")
    }
}