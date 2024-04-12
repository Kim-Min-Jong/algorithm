import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.min

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = readLine().split(" ")
    val n = list[0].toInt()
    val k = list[1].toInt()
    var remaining = k - n
    val result = MutableList(n) { 'A' }

    if (n * 26 < k || k < n) {
        bw.write("!")
    } else {
        for (i in n - 1 downTo  0) {
            if (k < 0) break
            val tmp = min(remaining, 25)
            result[i] = result[i] + tmp
            remaining -= tmp
        }

        bw.write(result.joinToString(""))
    }

    bw.flush()
    bw.close()
    close()
}
