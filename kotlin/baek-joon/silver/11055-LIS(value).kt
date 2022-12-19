import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
val dp  = Array(21){Array(21){Array(21){0}}}
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val l = readLine().split(" ").map{it.toInt()}
    val dp = IntArray(n){1}
    dp[0] = l[0]
    for(i in 1 until n){
        for(j in 0 until i){
            if(l[j] < l[i])
                dp[i] = Math.max(dp[i],dp[j]+l[i])
            else
                dp[i] = Math.max(dp[i], l[i])
        }
    }
    bw.write("${dp.maxOrNull()}")

    bw.flush()
    bw.close()
    close()
}