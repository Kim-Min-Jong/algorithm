import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }.sortedDescending()

    var cnt = 0

    for (i in 0 until m) {
        cnt += (list[i] - i)
    }

    bw.write("$cnt")

    closeBW()
    close()
}