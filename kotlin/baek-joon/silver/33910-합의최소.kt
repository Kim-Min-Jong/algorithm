import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val list = readLine().split(" ").map { it.toLong() }.toMutableList()

    var sum = list.last()

    for (i in t - 2 downTo 0) {
        list[i] = min(list[i], list[i + 1])
        sum += list[i]
    }
    
    bw.write("$sum")

    closeBW()
    close()
}