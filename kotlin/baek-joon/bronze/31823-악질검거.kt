import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val set = mutableSetOf<Int>()
    val resList = mutableListOf<String>()
    repeat(n) {
        val list = readLine()
        val strict = list.split("*").map { it.replace(" ", "") }.filter { it.isNotBlank() }
        set.add(if (strict.size == 1) 0 else strict.subList(0, strict.size - 1).maxOf { it.length })
        if (strict.size == 1) {
            resList.add("0 ${strict.last()}")
        } else {
            resList.add("${strict.subList(0, strict.size - 1).maxOf { it.length }} ${strict.last()}")
        }
    }
    bw.write("${set.size}\n")
    resList.forEach {
        bw.write("$it\n")
    }


    bw.flush()
    bw.close()
    close()
} // 반례 찾기...