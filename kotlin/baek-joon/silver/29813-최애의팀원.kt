import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val queue: Queue<String> = LinkedList()
    val map = HashMap<String, Int>()

    repeat(n) {
        val (str, value) = readLine().split(" ")
        queue.add(str)
        map[str] = value.toInt()
    }

    while (queue.size > 1) {
        val tmp = queue.poll()
        val num = map[tmp]!!
        for (i in 0 until num - 1) {
            queue.add(queue.poll())
        }
        queue.poll()
    }

    bw.write(queue.poll())
    
    bw.flush()
    bw.close()
    close()
}