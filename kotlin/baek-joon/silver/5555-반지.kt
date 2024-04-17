import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val ring = readLine()
    val n = readLine().toInt()
    var cnt = 0
    repeat(n) {
        var tmp = readLine()
        tmp += tmp
        if (tmp.contains(ring)) cnt++
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}