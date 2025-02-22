package lec10상속

abstract class Animal(protected val species : String,
                      protected open val legCount : Int) // 추상 프로퍼티가 아니면 상속받을때 open 붙여야 함
{

    abstract fun move()
}