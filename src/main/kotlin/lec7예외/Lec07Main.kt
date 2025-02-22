package lec7예외

fun main () {

    val printer = FilePrinter()
    printer.readFile()

}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("$str is not a number.")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e : NumberFormatException) {
        null
    } // try catch 구문 역시 expression이라 한번에 return 가능함
}