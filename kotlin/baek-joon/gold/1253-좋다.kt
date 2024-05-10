import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.sorted()

    var res = 0
    for (i in 0 until n) {
        val search = list[i]
        var start = 0
        var end = n - 1
        while (start < end) {
            if (list[start] + list[end] == search) {
                if (start == i) start++
                else if (end == i) end--
                else {
                    res++
                    break
                }
            } else if (list[start] + list[end] < search) {
                start++
            } else if (list[start] + list[end] > search) {
                end--
            }
        }
    }
    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}