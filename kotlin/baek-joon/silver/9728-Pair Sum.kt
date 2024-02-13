import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()
    (1..tc).forEach { idx ->
        val (n, m) = readLine().split(" ").map { it.toInt() }
        val list = readLine().split(" ").map { it.toInt() }
        var start = 0
        var end = n - 1
        var result = 0
        while (start < end) {
            when {
                list[start] + list[end] < m -> start++
                list[start] + list[end] > m -> end--
                else -> {
                    start++
                    result++
                }
            }
        }
        bw.write("Case #$idx: $result\n")
    }

    bw.flush()
    bw.close()
    close()
}