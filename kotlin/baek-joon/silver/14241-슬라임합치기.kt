import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val queue = PriorityQueue<Int>(Collections.reverseOrder())
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}
    var score = 0
    list.forEach {
        queue.add(it)
    }
    while(queue.size > 1) {
        val a = queue.poll()
        val b = queue.poll()
        score += a * b
        queue.add(a + b)
    }

    bw.write("$score")

    bw.flush()
    bw.close()
    close()
}