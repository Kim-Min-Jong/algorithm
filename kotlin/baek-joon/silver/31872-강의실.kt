import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toLong() }.toMutableList().apply { add(0) }.sorted()
    val subList = mutableListOf<Long>()
    for (i in 1 until list.size) {
        subList.add(list[i] - list[i - 1])
    }
    bw.write("${subList.sorted().dropLast(k).sum()}")

    bw.flush()
    bw.close()
    close()
}