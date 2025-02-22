package lec15배열컬렉션

fun main() {

    // 배열
    val array = arrayOf(100, 200)
    array.plus(300)

    //array.indices는 0부터 마지막 index까지의 range
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    //withIndex()를 사용하면 인덱스와 값을 한번에 가져올 수 있음
    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    // 리스트
    val numbers = listOf(100, 200) //listof을 통해 불변 리스트 만듬
    val emptyList = emptyList<Int>() //비어있는 리스트 만듬 꺽쇠 안에 타입적어줘야함, lec3타입 추론이 가능하면 생략 가능
    // val numbers = mutableListOf(100, 200) 가변 리스트
    // numbers.add(300)

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((inx, value) in numbers.withIndex()) {
        println("$inx $value")
    }

    // 맵
    val map = mutableMapOf<Int, String>() //가변 맵
    map[1] = "MONDAY"
    map[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY") // 불변 맵

    for (key in map.keys) {
        println(key)
        println(map[key])
    }

    for ((key, value) in map.entries) {
        println(key)
        println(value)
    }

    // List<Int?> : 리스트에 널 들어갈 수 있음, 리스트는 절대 널 아님
    // List<Int>? : 리스트에 널 못 들어감, 리스트는 널 일수도 있음
    // List<Int?>? : 리스트에 널 들어갈 수 있고 리스트도 널 일수 있음

    // 자바랑 같이 쓸때 주의점
    // 코틀린의 불변 리스트를 만들어도 자바는 불변인지 모르고 엘리먼트 추가 가능
    // 코틀린의 널 못들어가는 리스트도 자바는 인식못함 널 넣을 수 있음
    // 예를들어 자바에서 List<Integer> 가져올 때 코틀린은 List<Int?>인지 아님 다른 물음표 붙인건지 모름



}