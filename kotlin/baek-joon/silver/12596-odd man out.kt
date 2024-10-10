import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()

    (1..tc).forEach { idx ->
        val n = readLine().toInt()
        val map = readLine().split(" ").groupBy { it }.map { it.key to it.value.size }

        bw.write("Case #$idx: ${map.find { it.second == 1 }!!.first}\n")
    }

    bw.flush()
    bw.close()
    close()
}