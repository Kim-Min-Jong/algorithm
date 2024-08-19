import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (x, y) = readLine().split(" ").map { it.toInt() }
    val n = readLine().toInt()
    val widths = mutableListOf<Int>(0, x)
    val heights = mutableListOf<Int>(0, y)

    repeat(n) {
        val (command, len) = readLine().split(" ").map { it.toInt() }
        when(command) {
            0 -> heights.add(len)
            1 -> widths.add(len)
        }
    }
    widths.sort()
    heights.sort()

    var answer = 0

    for (i in 1 until widths.size) {
        for (j in 1 until heights.size) {
            val w = widths[i] - widths[i - 1]
            val h = heights[j] - heights[j - 1]
            answer = max(answer, w * h)
        }
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
    close()
}