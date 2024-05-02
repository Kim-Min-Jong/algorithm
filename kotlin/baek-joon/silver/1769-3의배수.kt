import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine()
    var cnt = 0

    while (n.length > 1) {
        n = n.chunked(1).map { it.toInt() }.sum().toString()
        cnt++
    }
    bw.write("$cnt\n")
    bw.write(if (n.toInt() % 3 == 0) "YES" else "NO")

    bw.flush()
    bw.close()
    close()
}