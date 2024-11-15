import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = MutableList(100) { MutableList(100) { 0 } }
    var cnt = 0
    for (i in 0 until n) {
        val (x1, y1, x2, y2) = readLine().split(" ").map { it.toInt() }
        for (j in x1 .. x2) {
            for (k in y1 .. y2) {
                list[j-1][k-1]++
            }
        }
    }

    for (i in 0 until 100) {
        for (j in 0 until 100) {
            if (m < list[i][j]) cnt++
        }
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}