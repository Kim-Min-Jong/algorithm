import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()
    repeat(tc) {
        val n = readLine().toInt()
        val list = readLine().split(" ").map{it.toInt()}
        val total = readLine().toInt()
        val dp = IntArray(10001)
        dp[0] = 1

        for(i in list){
            for(j in 1..total){
                if(j - i >= 0)
                    dp[j] += dp[j - i]
            }
        }
        bw.write("${dp[total]}\n")
    }

    bw.flush()
    bw.close()
    close()
}