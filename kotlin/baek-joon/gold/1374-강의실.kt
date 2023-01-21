import java.io.BufferedWriter
import java.io.OutputStreamWriter

import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val classList = mutableListOf<Time>()
    val queue = PriorityQueue<Int>()
    repeat(n) {
        val (num, start, finish) = readLine().split(" ").map { it.toInt() }
        classList.add(Time(start, finish))
    }
    classList.sortWith(compareBy<Time> { it.start })
    queue.add(classList[0].end)
    for(i in 1 until classList.size) {
        if(classList[i].start < queue.peek())
            queue.add(classList[i].end)
        else {
            queue.poll()
            queue.add(classList[i].end)
        }
    }
    bw.write("${queue.size}")
    bw.flush()
    bw.close()
    close()
}
data class Time(
    val start: Int,
    val end:Int
)