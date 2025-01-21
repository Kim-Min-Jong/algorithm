import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }.sorted()

    var cnt = 1

    if (n == 1) {
        bw.write("1")
    } else {
        for (i in 1 until n) {
            if (list[i] + list[i - 1] <= m) {
                cnt++
            } else break
        }
        bw.write("$cnt")
    }

    closeBW()
    close()
}