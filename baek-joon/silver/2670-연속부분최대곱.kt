import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = DoubleArray(n){0.0}
    for(i in 0 until n) {
        arr[i] = readLine().toDouble()
    }

    bw.write(String.format("%.3f", mul(arr)))

    bw.flush()
    bw.close()
    close()
}

fun mul(arr: DoubleArray) :Double?{
    val dp = DoubleArray(arr.size){0.0}
    var max = 0.0
    dp[0] = arr[0]
    for(i in 1 until arr.size) {
        dp[i] = Math.max(arr[i], dp[i-1] * arr[i])
        max = Math.max(max, dp[i])
    }
    return max
}