package lec8함수

fun main () {
    repeat("Hello World")
    repeat("Hello Kotlin", useNewLine = false) // named argument
    //Lec08Main.repeat() // 자바에서 가져오는 함수는 named argument를 쓸 수 없다

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array) // 배열 넣을땐 자바와 달리 변수 앞에 * 넣어 줘야함 (스프레드 lec4연산자)
                    // 가변인자 함수를 배열과 호출할 때 *
}

// public은 생략 가능
// fun은 함수를 의미하는 키워드
// if else는 expression이라 리턴을 밖으로 뺄 수 있음
// if else는 하나의 결과값이기 때문에 중괄호 대신에 = 쓸 수 있음 리턴 빼줘야함
// 결과가 어떤 경우건 int 반환이기 때문에 lec3타입 생략 가능 (중괄호 대신 =을 썼기 때문)
// 만약 block {}을 사용하는 경우 반환 타입이 Unit이 아니면 명시적으로 작성해야함
fun max (a : Int, b : Int) = if (a > b) a else b

fun repeat (str : String,
            num : Int = 3,
            useNewLine : Boolean = true // 디폴트 파라미터 파라미터가 없으면 기본값
) {                                     // 코틀린에도 오버로딩 있긴함
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}
                                        // 가변인자
fun printAll (vararg strings: String) { // java는 타입뒤에 ...적어줌 코틀린은 제일앞에 vararg
    for (str in strings) {
        println(str)
    }
}
