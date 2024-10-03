import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Triple<Int, Int, Int>>()

    repeat(n) {
        val (h, m, s) = readLine().split(" ").map { it.toInt() }
        list.add(Triple(h, m, s))
    }

    list.sortWith(compareBy<Triple<Int, Int, Int>> { it.first }.thenBy { it.second }.thenBy { it.third })

    list.forEach {
        bw.write("${it.first} ${it.second} ${it.third}\n")
    }

    bw.flush()
    bw.close()
    close()
}