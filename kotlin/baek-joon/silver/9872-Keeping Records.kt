import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Triple<String, String, String>>()
    repeat(n) {
        val (a, b, c) = readLine().split(" ").sorted()
        list.add(Triple(a, b, c))
    }

    bw.write("${list.groupBy { it }.map { it.key to it.value.size }.maxOf { it.second }}")

    bw.flush()
    bw.close()
    close()
}
