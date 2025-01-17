import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pivot = 6174
    repeat(n) {
        var input = readLine().toInt()
        var cnt = 0
        while (input != pivot) {
            cnt++
            val tmp = input.toString().map { it.toString() }
            input = tmp.sortedDescending().joinToString("").toInt() - tmp.sorted().joinToString("").toInt()

            if (input < 1000) {
                var str = input.toString()
                repeat(4 - str.length) {
                   str += "0"
                }
                input = str.toInt()
            }
        }
        bw.write("$cnt\n")
    }


    closeBW()
    close()
}