import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, t) = readLine().split(" ").map { it.toInt() }
    val timeList = mutableListOf<Long>()

    repeat(n) {
        val (s, i, c) = readLine().split(" ").map { it.toLong() }
        for (j in 0 until c) {
            timeList.add(s + i * j)
        }
    }

    timeList.sort()

    var start = 0
    var end = timeList.size
    var answer = 0

    while (start < end) {
        val mid = (start + end) / 2
        if (t <= timeList[mid]) {
            answer = mid
            end = mid
        } else {
            start = mid + 1
        }
    }

    bw.write(if (timeList[answer] - t >= 0) "${timeList[answer] - t}" else "-1")

    bw.flush()
    bw.close()
    close()
}