import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().trim().split(" ").map { it.toInt() }
    val list = readLine().trim().split(" ").map { it.toInt() }
    val prefixSum = Array(n+1) { 0 }
    var max = Int.MIN_VALUE
    for (i in 1 .. n) {
        prefixSum[i] = list[i-1] + prefixSum[i - 1]
    }

    for (i in k..n) {
        val tmp = prefixSum[i] - prefixSum[i-k]
        if (tmp > max) max = tmp
    }

    bw.write("$max")

    bw.flush()
    bw.close()
    close()
}
