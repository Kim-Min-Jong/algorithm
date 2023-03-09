import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt() 
    val list = readLine().split(" ").map{it.toInt()}
    val dp = IntArray(n){1}
    val reverseDp = IntArray(n){1}
    for(i in 1 until n){
        for(j in 0 until i){
            if(list[j] < list[i])
                dp[i] = Math.max(dp[i],dp[j]+1)
        }
    }
    for(i in n-1 downTo 0) {
        for(j in n-1 downTo i) {
            if(list[j] < list[i])
                reverseDp[i] = Math.max(reverseDp[i],reverseDp[j]+1)
        }
    }

    var answer = 0
    for (i in 0 until n) {
        answer = maxOf(answer, dp[i] + reverseDp[i] - 1)
    }
    bw.write("$answer")
    bw.flush()
    bw.close()
    close()
}