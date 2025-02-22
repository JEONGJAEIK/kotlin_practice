package lec7예외

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    // 코틀린은 체크드 예외와 언체크드 예외를 구분하지 않음 모두 언체크드 lec7예외
    // throws를 안붙여도 빨간줄 안남


    // java의 try with resources 구문 사라짐
    fun readFile2 (path : String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}