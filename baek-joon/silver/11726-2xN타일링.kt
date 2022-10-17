import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
const val INF = 10000000
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val dp = mutableListOf(0,1,2)

    for(i in 3..n)
        dp.add((dp[i-2]+dp[i-1]) % 10007)

    bw.write("${dp[n]}")

    bw.flush()
    bw.close()
    close()
}