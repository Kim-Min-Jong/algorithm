import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(n+1){0}
    dp[1] = 1
    dp[2] = 2
    for(i in 3..n){
        dp[i] = (dp[i-1] + dp[i-2]) % 10
    }
    bw.write("${dp[n]}")

    bw.flush()
    bw.close()
    close()
}
