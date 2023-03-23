import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{ it.toInt() }
    val list = HashMap<String, Int>()
    var mapIdx = 0
    repeat(m) {
        val str = readLine()
        list[str] = mapIdx++
    }
    list.toList().sortedBy { it.second }.take(n).forEach {
        bw.write("${it.first}\n")
    }

    bw.flush()
    bw.close()
    close()
}