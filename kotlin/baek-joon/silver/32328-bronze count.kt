import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(readLine().toInt())
    }

    val third = list.groupBy { it }.map { it.key to it.value.size }.sortedByDescending { it.first }[2]

    bw.write("${third.first} ${third.second}")

    bw.flush()
    bw.close()
    close()
}