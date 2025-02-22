package lec10상속

class Cat(species: String) : Animal(species, 4) {
        // 타입을 나타낼땐 변수에서 한 칸 안 띄우고 : 상속을 나타낼땐 한 칸 띄우고 :
    override fun move() {
        println("고양이")
    }
}