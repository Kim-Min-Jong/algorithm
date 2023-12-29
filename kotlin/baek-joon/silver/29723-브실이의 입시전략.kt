import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashMap

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    val map = hashMapOf<String, Int>()
    val cnt = m - k
    var minSum = 0
    var maxSum = 0
    repeat(n) {
        val (name, score) = readLine().split(" ")
        map[name] = score.toInt()
    }

    repeat(k) {
        val name = readLine()
        minSum += map[name] ?: 0
        maxSum += map[name] ?: 0
        map.remove(name)
    }

    val sorted = map.toList().sortedBy { it.second }
    for(i in 0 until cnt) {
        minSum += sorted[i].second
        maxSum += sorted[sorted.size - 1 - i].second
    }

    bw.write("$minSum $maxSum")

    bw.flush()
    bw.close()
    close()
}
