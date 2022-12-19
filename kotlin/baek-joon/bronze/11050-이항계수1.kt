import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val (n,m) = readLine().split(" ").map{it.toInt()}
    val dp = Array(100){IntArray(100){0} }
    bw.write("${binomial(n,m,dp)}")
    bw.flush()
    bw.close()
    close()
}
//이항계수
fun binomial(n:Int, r:Int, dp:Array<IntArray>):Int{
    for(i in 0..n) {
        for (j in 0..Math.min(r,i)) {
            if (j == 0 || j == i)
                dp[i][j] = 1
            else
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
        }
    }
    return dp[n][r]
}