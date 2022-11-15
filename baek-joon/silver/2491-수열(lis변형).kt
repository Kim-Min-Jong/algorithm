import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.lang.Integer.max
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val l = readLine().split(" ").map{it.toInt()}
    val dp = IntArray(n){1}
    val dp2 = IntArray(n){1}
    for(i in 1 until n){
        if(l[i] <= l[i-1]){
            dp[i] = Math.max(dp[i],dp[i-1]+1)
        }
        if(l[i] >= l[i-1]){
            dp2[i] = Math.max(dp2[i],dp2[i-1]+1)
        }

    }
    bw.write("${max(dp.maxOrNull()!!,dp2.maxOrNull()!!)}")

    bw.flush()
    bw.close()
    close()
}
