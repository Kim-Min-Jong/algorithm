import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()

    repeat(t) {
        val (n, m) = readLine().split(" ").map { it.toInt() }

        val aList = readLine().split(" ").map { it.toInt() }.sorted()
        val bList = readLine().split(" ").map { it.toInt() }.sorted()

        var cnt = 0

        for (i in 0 until n) {
            var start = 0
            var end = m - 1
            var tmp = 0
            while (start <= end) {
                var mid = (start + end) / 2
                if (aList[i] > bList[mid]) {
                    start = mid + 1
                    tmp = mid + 1
                } else {
                    end = mid - 1
                }
            }
            cnt += tmp
        }
        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()
    close()
}