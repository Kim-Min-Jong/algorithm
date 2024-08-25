import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, h) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }
    var cnt = 0
    var sum = 0L

    for (i in 0 until n) {
        sum += list[i]
        cnt++
        if (sum >= h) break
    }

    if (sum < h) {
        bw.write("-1")
    } else {
        bw.write("$cnt")
    }

    bw.flush()
    bw.close()
    close()
}