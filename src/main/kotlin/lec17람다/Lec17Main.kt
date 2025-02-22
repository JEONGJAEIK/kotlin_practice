package lec17람다

import com.lannstark.lec17.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    // lec17람다 (이름없는 lec8함수)
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    filterFruits(fruits) {it.name == "사과"}
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }
    return result
}

// 함수는 java에서 2급시민이지만 코틀린에서는 1급시민 때문에 함수자체를 변수에 넣을 수 있고 파라미터로 전달 가능
// 코틀린에서 lec8함수 타입은 파라미터 lec3타입 -> 반환 lec3타입
// 코틀린에서는 closure을 사용하여 non-final 변수도 람다에서 사용 가능
