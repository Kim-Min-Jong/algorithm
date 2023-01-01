import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.lang.Integer.max
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(n+1) {0}
    val arr = IntArray(n+1) {0}

    for(i in 1 ..n) {
        arr[i] = readLine().toInt()
    }
    dp[1] = arr[1]
    if(n >= 2) {
        dp[2] = arr[1] + arr[2]
    }
    for(i in 3 ..n) {
        dp[i] = max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i]
    }

    bw.write("${dp[n]}")

    bw.flush()
    bw.close()
    close()
}