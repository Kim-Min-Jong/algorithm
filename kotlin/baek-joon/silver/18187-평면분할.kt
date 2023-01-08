import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(101) { 0 }
    var tmp = 3

    dp[1] = 2
    dp[2] = 4

    for(i in 3..n) {
        dp[i] = dp[i - 1] + tmp
        if(i % 3 != 0) ++tmp
    }

    bw.write("${dp[n]}")
    
    bw.flush()
    bw.close()
    close()
} 