import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.min

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.sorted()
    var sum = Int.MAX_VALUE

    for (i in 0 until n) {
        val tmp = list[i] + list[n*2 - i - 1]
        sum = min(sum, tmp)
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}