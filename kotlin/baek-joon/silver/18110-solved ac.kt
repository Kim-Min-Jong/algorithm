import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()
    val cut = Math.round(n * 0.15).toInt()
    var sum = 0.0
    repeat(n) {
        list.add(readLine().toInt())
    }

    list.sort()

    for (i in cut until (n - cut)) {
        sum += list[i]
    }

    bw.write("${Math.round(sum / (n - 2 * cut)).toInt()}")
    bw.flush()
    bw.close()
    close()
}