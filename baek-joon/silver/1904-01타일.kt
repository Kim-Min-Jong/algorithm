import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val dp = Array<Int>(1000001){0}
    dp[1] = 1
    dp[2] = 2

    for(i in 3 until dp.size){
        dp[i] = (dp[i - 2] + dp[i - 1]) % 15746
    }

    bw.write("${dp[n]}\n")

    bw.flush()
    bw.close()
    close()
}