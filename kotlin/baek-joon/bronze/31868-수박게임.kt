import java.io.OutputStreamWriter
import java.io.BufferedWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }

    bw.write("${k / pow2(n-1) }")

    bw.flush()
    bw.close()
    close()
}
fun pow2(n: Int): Int {
    var res = 1
    for (i in 0 until n) {
        res *= 2
    }
    return res
}