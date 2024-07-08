import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val m = readLine().toInt()
        val list = readLine().split(" ").map { it.toInt() }
        val dp = IntArray(m) { 0 }
        dp[0] = list[0]
        for (i in 1 until m) {
            dp[i] = max(list[i], list[i] + dp[i - 1])
        }
        bw.write("${dp.max()}\n")
    }

    bw.flush()
    bw.close()
    close()
}