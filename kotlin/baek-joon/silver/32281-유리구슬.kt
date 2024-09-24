import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val str = readLine().split("0")
    var total = 0L


    str.forEach {
        val count = it.length.toLong() * (it.length.toLong() + 1L) / 2L
        total += count
    }

    bw.write("$total")

    bw.flush()
    bw.close()
    close()
}