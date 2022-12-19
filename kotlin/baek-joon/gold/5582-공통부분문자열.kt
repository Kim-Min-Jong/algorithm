import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str1 = readLine()
    val str2 = readLine()
    val dp = Array(str1.length+1) {IntArray(str2.length+1)}
    var result = 0

    for(i in 1 until str1.length+1) {
        for(j in 1 until str2.length+1) {
            if(str1[i-1] == str2[j-1]) {
                dp[i][j] = dp[i-1][j-1] + 1
                result = max(dp[i][j], result)
            }
        }
    }
    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
