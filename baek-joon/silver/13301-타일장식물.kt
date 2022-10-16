import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = LongArray(n + 2) { 0L }
    dp[1] = 1L
    dp[2] = 1L

    for (i in 3..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    bw.write("${(2 * dp[n]) + (2 * (dp[n - 1] + dp[n]))}")

    bw.flush()
    bw.close()
    close()
}