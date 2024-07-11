import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toDouble() }.sortedDescending()

    var first = list.first()

    for (i in 1 until n) {
        val tmp: Double = list[i] / 2.0
        first += tmp
    }

    bw.write("$first")

    bw.flush()
    bw.close()
    close()
}