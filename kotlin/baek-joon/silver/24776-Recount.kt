import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val list = mutableListOf<String>()
    while (true) {
        val str = readLine()
        if (str == "***") break
        list.add(str)
    }

    val sorted = list.groupBy { it }.map { it.key to it.value.size }.sortedByDescending { it.second }
    val first = sorted[0].second
    val second = sorted[1].second

    if (first == second) {
        bw.write("Runoff!")
    } else {
        bw.write("${sorted[0].first}")
    }

    closeBW()
    close()
}