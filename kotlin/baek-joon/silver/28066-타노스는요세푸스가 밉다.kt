import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val queue: Queue<Int> = LinkedList()
    (1..n).forEach {
        queue.add(it)
    }

    while (queue.size != 1) {
        val tmp = queue.first()
        val cnt = min(queue.size, k)
        repeat(cnt) {
            queue.poll()
        }
        queue.add(tmp)
    }

    bw.write("${queue.first()}")

    bw.flush()
    bw.close()
    close()
}