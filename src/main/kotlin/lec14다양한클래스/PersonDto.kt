package lec14다양한클래스

fun main() {
    val dto1 = PersonDto("정재익", 20)
    val dto2 = PersonDto("정재익", 30)
    println(dto1)
}

// data class는 equals, hashcode, tostring 자동으로 만들어 줌
data class PersonDto(
    val name: String,
    val age: Int) {

}