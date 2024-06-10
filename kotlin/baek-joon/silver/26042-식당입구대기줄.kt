import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    var cnt = 0
    var num = Int.MAX_VALUE

    for (i in 0 until n) {
        val command = readLine().split(" ").map { it.toInt() }
        when(command[0]) {
            1 -> queue.add(command[1])
            2 -> queue.poll()
        }
        // 인원 풀
        if (cnt == queue.size) {
            num = min(num, queue.last())
        } else if (cnt < queue.size){
            cnt = queue.size
            num = queue.last()
        }
    }

    bw.write("$cnt $num")

    bw.flush()
    bw.close()
    close()
}