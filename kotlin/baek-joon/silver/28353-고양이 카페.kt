import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }.sorted()

    var res = 0

    var start = 0
    var end = n - 1

    while (start < end) {
        if (list[start] + list[end] <= k) {
            start++
            end--
            res++
        } else {
            end--
        }
    }

    bw.write("$res")

    closeBW()
    close()
}