import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val dp = Array<Long>(101){0L}
    dp[0] = 1L
    dp[1] = 1L
    dp[2] = 1L

    for(i in 3 until dp.size){
        dp[i] = dp[i - 3] + dp[i - 2]
    }

    repeat(n){
        val m = readLine().toInt()
        bw.write("${dp[m - 1]}\n")
    }

    bw.flush()
    bw.close()
    close()
}