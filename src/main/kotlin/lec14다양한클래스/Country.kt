package lec14다양한클래스

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

// 코틀린의 enum은 자바의 enum과 동일 when과 함께 사용할때 큰 장점
enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}