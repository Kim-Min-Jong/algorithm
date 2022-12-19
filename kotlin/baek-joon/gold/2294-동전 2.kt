import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ").map{it.toInt()}
    val dp = IntArray(input[1] + 1) {Int.MAX_VALUE}
    dp[0] = 0
    repeat(input[0]){
        val m = readLine().toInt()
        for(i in m..input[1]) {
            if(dp[i - m] != Int.MAX_VALUE){
                dp[i] = min(dp[i], dp[i - m] + 1)
            }
        }
    }
    if(dp[input[1]] == Int.MAX_VALUE){
        bw.write("-1")
    } else{
        bw.write("${dp[input[1]]}")
    }

    bw.flush()
    bw.close()
    close()
}