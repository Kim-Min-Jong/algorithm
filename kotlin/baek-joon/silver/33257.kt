import java.io.BufferedWriter
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, e) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }.sorted()
    var cnt = 1

    for (i in 1 until list.size) {
        if (list[i] - list[i - 1] >= e) {
            cnt++
        }
    }

    bw.write("$cnt")

    closeBW()
    close()
}