import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception
import java.util.PriorityQueue
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var result: Array<String>
lateinit var map: HashMap<Long, Long>
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        list.add(x to y)
    }
    when(n) {
        1 -> bw.write("0")
        else -> bw.write("${(list.maxOf{ it.first } - list.minOf { it.first }) * (list.maxOf{ it.second } - list.minOf { it.second })}")
    }

    bw.flush()
    bw.close()
    close()
}