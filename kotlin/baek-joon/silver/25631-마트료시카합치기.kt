import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.toMutableList()
    var cnt = 0

    while (list.isNotEmpty()) {
        val tmp = list.sorted().toSet()

        for (i in tmp) {
            list.removeAt(list.indexOf(i))
        }
        cnt++
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
    close()
}