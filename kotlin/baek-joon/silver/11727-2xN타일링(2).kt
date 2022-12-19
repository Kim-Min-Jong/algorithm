import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(10008) { 0 }
    dp[1] = 1
    dp[2] = 3

    for (i in 3..n) {
        dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007
    }

    bw.write("${dp[n]}")

    bw.flush()
    bw.close()
    close()
}