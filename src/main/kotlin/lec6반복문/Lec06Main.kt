package lec6반복문

fun main () {

    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    // ..과 downTo는 등차수열을 만드는 코드
    // 1..5 step 2 시작값 1 끝값 5 공차 2인 등차수열
    // 3 downTo 1 시작값 3 끝값 1 공차가 -1인 등차수열

    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}