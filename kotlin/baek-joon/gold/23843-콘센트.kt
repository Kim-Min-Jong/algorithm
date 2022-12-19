import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.PriorityQueue

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (_, m) = readLine().split(" ").map{it.toInt()}
    val list = readLine().split(" ").map{it.toInt()}.sortedDescending()
    val queue = PriorityQueue<Int>()

    for(i in list) {
        if(queue.size < m) {
            queue.add(i)
        } else {
            val done = queue.poll()
            queue.add(done + i)
        }
    }

    bw.write("${queue.maxOrNull()}")

    bw.flush()
    bw.close()
    close()
}