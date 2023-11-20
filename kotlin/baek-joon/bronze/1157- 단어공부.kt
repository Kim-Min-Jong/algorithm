import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine().uppercase(Locale.getDefault())
    val group = str.groupBy { it }.map { it.key to it.value.size }
    val count = group.maxOf { it.second }
    val maxGroup = group.filter { it.second == count }
    if(maxGroup.size >= 2) {
        bw.write("?")
    } else {
        bw.write("${group.maxByOrNull { it.second }!!.first}")
    }

    bw.flush()
    bw.close()
    close()
}