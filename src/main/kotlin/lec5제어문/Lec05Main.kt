package lec5제어문

fun main () {

}

fun validateScoreIsNotNegative (score : Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없다")
    }
}

fun getPassOfFail (score : Int) : String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

// if-else는 자바에서 Statement 코틀린에서 Expression
// Statement < Expression 포함관계
// Statement는 프로그램의 문장 항상 값을 도출하지는 않음 자바의 if문에 = 을 쑬 수 없는 건
// if문은 하나의 값이 아니기 때문
// Expression은 값을 항상 도출함
// 코틀린은 if-else를 Expression으로 사용가능하여 삼항연산자가 없음

fun getGrade (score: Int) : String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun validate(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100입니다")
    }
}

fun validate2(score: Int) {
    if (score in 0..100) {
        println("$score")
    }
}

fun getGradeWithSwitch(score : Int) : String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score : Int) : String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

//when (값) {
// 조건부 -> 어떠한 구문    조건부에는 어떠한 expression도 들어갈 수 있다 (ex. is Type)
// 조건부 -> 어떠한 구문
// else -> 어떠한 구문
// }

fun starsWithA(obj : Any) : Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number : Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

// when에 값 자체가 안들어갈수도 있음
fun judgeNumber2(number : Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}