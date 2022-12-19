import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = LongArray(36) {0}
    dp[0] = 1
    dp[1] = 1

    for(i in 2 until 36) {
        for(j in 0 until i) {
            dp[i] += dp[j] * dp[i-j-1]
        }
    }
    bw.write("${dp[n]}")

    bw.flush()
    bw.close()
    close()
}