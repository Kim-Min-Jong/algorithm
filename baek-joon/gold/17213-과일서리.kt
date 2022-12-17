import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*


val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    val answer: Long = factorial(m-n+1, m-1) / factorial(1, n-1)
    bw.write("$answer")

    bw.flush()
    bw.close()
    close()
}
fun factorial(a: Int, b: Int): Long {
    var res = 1L
    for(i in a..b) {
        res *= i
    }
    return res
}