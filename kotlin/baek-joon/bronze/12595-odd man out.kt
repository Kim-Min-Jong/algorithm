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

    for (i in 1 .. n) {
        val g = readLine().toInt()
        val list = readLine().split(" ").groupBy { it }.map { it.key to it.value.size }

        bw.write("Case #$i: ${list.minBy { it.second }.first}\n")
    }
    closeBW()
    close()
}