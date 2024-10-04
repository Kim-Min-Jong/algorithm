import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()

    (1..tc).forEach { idx ->
        val n = readLine().toInt()
        val a = readLine().split(" ").map { it.toInt() }.sorted()
        val b = readLine().split(" ").map { it.toInt() }.sortedDescending()
        var sum = 0

        for (i in 0 until n) {
            sum += a[i] * b[i]
        }

        bw.write("Case #$idx: $sum\n")
    }

    bw.flush()
    bw.close()
    close()
}