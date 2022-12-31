import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map{it.toInt()}
    val arr = IntArray(n-1){0}
    for(i in 0 until list.size-1) {
        arr[i] = list[i+1] - list[i]
    }
    bw.write("${arr.sorted().take(n-k).sum()}")

    bw.flush()
    bw.close()
    close()
}