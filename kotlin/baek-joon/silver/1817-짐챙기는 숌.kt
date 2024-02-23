import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }

    if (n == 0) {
        bw.write("0")
    } else {
        val list = readLine().split(" ").map { it.toInt() }
        var weight = 0
        var cnt = 1
        for (i in list) {
            if (i + weight <= m) {
                weight += i
            } else {
                weight = i
                cnt++
            }
        }
        bw.write("$cnt")
    }

    bw.flush()
    bw.close()
    close()
}