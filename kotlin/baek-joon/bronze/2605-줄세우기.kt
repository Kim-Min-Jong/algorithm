import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val result = mutableListOf<Int>()

    for (i in 1 until n + 1) {
        result.add(result.size - list[i - 1], i)
    }

    bw.write(result.joinToString(" "))

    bw.flush()
    bw.close()
    close()
}