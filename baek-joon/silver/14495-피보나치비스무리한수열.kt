import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = LongArray(116) {1}
    for(i in 3 until 116) {
        dp[i] = dp[i-1] + dp[i-3]
    }
    bw.write("${dp[n-1]}")

    bw.flush()
    bw.close()
    close()
} 