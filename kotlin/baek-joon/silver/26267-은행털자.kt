import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = hashMapOf<Long, Long>()
    repeat(n) {
        val (x, t, c) = readLine().split(" ").map { it.toLong() }
        map[t - x] = map.getOrDefault(t - x, 0) + c
    }

    bw.write("${map.values.max()}")

    bw.flush()
    bw.close()
    close()
}