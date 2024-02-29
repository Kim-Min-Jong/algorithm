import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val prefixSum = IntArray(n + 1) { 0 }
    val list = readLine().split(" ").map { it.toInt() }.sorted()

    // make prefix sum array
    for (i in 0 until n)  {
        prefixSum[i + 1] = prefixSum[i] + list[i]
    }

    repeat(m) {
        val (start, end) = readLine().split(" ").map { it.toInt() }
        bw.write("${prefixSum[end] - prefixSum[start - 1]}\n")
    }


    bw.flush()
    bw.close()
    close()
}