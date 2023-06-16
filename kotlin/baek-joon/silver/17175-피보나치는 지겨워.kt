import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(n+1) {0}
    dp[0] = 1
    try {
        dp[1] = 1
    } catch(_: Exception) {}
    for(i in 2..n) {
        dp[i] = (dp[i-2] + dp[i-1] + 1) % 1_000_000_007
    }
    bw.write("${dp[n]}")
    bw.flush()
    bw.close()
    close()
}