import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toLong() }.sorted()
    var resTmp = Long.MAX_VALUE
    var start = 0
    var end = n
    var answer = list.max()

    while (start <= end) {
        val mid = (start + end) / 2
        val tmp = list.sumOf { abs(it - list[mid]) }
        if (resTmp >= tmp) {
            answer = min(answer, list[mid])
            resTmp = tmp
            end = mid - 1
        } else {
            start = mid + 1
        }
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
    close()
}