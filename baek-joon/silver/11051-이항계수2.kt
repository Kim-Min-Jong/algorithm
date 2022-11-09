import java.io.*
import java.util.*
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (n,r) = readLine().split(" ").map{it.toInt()}
    val dp = Array(n+1){IntArray(n+1)}
    val binomial: Long = binomial(n,r,dp) % 10007

    bw.write("${binomial.toInt()}")

    bw.flush()
    bw.close()
    close()
}
fun binomial(n:Int, r:Int, dp:Array<IntArray>):Long{
    for(i in 0..n) {
        for (j in 0..Math.min(r,i)) {
            if (j == 0 || j == i)
                dp[i][j] = 1
            else
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007
        }
    }
    return dp[n][r].toLong()
}