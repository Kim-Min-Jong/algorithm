import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val dp = IntArray(1000001){0}
    dp[0] = 1

    for(i in 1..1000000) {
        dp[i] = (dp[(i-sqrt(i.toDouble())).toInt()] + dp[ln(i.toDouble()).toInt()] + dp[(i*sin(i.toDouble())*sin(i.toDouble())).toInt()]) % 1000000
    }

    while(true){
        val n = readLine().toInt()
        if(n == -1) break
        bw.write("${dp[n]}\n")
    }

    bw.flush()
    bw.close()
    close()
}