import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = readLine().split("-").map { it.chunked(1) }.flatten()

    val map = list.groupBy { it }

    bw.write("${map.size}")

    bw.flush()
    bw.close()
    close()
}