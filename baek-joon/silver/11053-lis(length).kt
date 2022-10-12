import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val l = readLine().split(" ").map{it.toInt()}
    val dp = IntArray(n){1}
    for(i in 1 until n){
        for(j in 0 until i){
            if(l[j] < l[i])
                dp[i] = Math.max(dp[i],dp[j]+1)
        }
    }
    bw.write("${dp.maxOrNull()}")

    bw.flush()
    bw.close()
    this.close()
}