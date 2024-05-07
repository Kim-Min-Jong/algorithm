import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toDouble() }.sorted()
    var cnt = 1
    var tmp = list[0]

    for (i in 1 until list.size) {
        if (tmp * 2 > list[i]) continue
        tmp = list[i]
        cnt++
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}