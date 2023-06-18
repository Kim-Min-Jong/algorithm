import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
val map = HashMap<Long, Long>()
var P = 0L
var Q = 0L
var Y = 0L
var X = 0L
fun main() = with(System.`in`.bufferedReader()) {
    val (n, p, q, x, y) = readLine().split(" ").map{it.toLong()}
    map[0] = 1L
    P = p
    Q = q
    X = x
    Y = y
    bw.write("${dp(n)}")
    bw.flush()
    bw.close()
    close()
}
fun dp(N:Long): Long {
    return when {
        N <= 0 -> 1L
        else -> map[N] ?: (dp(N / P - X) + dp(N / Q - Y)).also { map[N] = it }
    }
}