import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
        val tc = readLine().toInt()
    val list = Array(tc){Node(0L,0L)}
    for (i in list.indices) {
        val (a, b) = readLine().split(" ").map { it.toLong() }
        list[i].a = a
        list[i].b = b
    }
    list.sortBy { it.a }
    var min = list[0].a
    var max = list[0].b
    var sum = 0L
    for (i in 1 until list.size) {
        when{
            list[i].a <= max && max < list[i].b  ->
                max = list[i].b
            max >= list[i].b -> continue
            else -> {
                sum += max - min
                min = list[i].a
                max = list[i].b
            }
        }

    }
    // 마지막이 포함안되있으므로 포함시킴
    bw.write("${sum+max-min}")

    bw.flush()
    bw.close()
    close()
}
data class Node(
    var a: Long,
    var b: Long
)