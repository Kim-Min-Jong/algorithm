import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while(true){
        val str = readLine() ?: break
        val st = StringTokenizer(str)
        val str1 = st.nextToken()
        val str2 = st.nextToken()
        val dp = Array(str1.length+1) {IntArray(str2.length+1)}

        for(i in 1 until str1.length+1) {
            for(j in 1 until str2.length+1) {
                if(str1[i-1] == str2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1
                } else {
                    dp[i][j] = max(dp[i-1][j], dp[i][j-1])
                }
            }
        }
        if(str1.length == dp[str1.length][str2.length]) {
            bw.write("Yes\n")
        } else bw.write("No\n")
    }
    bw.flush()
    bw.close()
    close()
}