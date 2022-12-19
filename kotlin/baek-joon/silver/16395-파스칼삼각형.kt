import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.lang.Math.pow
import kotlin.math.max
import kotlin.math.pow

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val dp = Array<IntArray>(n+1) { IntArray (n+1) {0} }
    dp[1][1] = 1

    for(i in 2..n) {
        for(j in 1..i) {
            dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
        }
    }

    bw.write("${dp[n][m]}")


    bw.flush()
    bw.close()
    close()
}