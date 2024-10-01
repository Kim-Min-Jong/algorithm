import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pq = PriorityQueue<Float>()

    repeat(n) {
        pq.add(readLine().toFloat())
    }

    repeat(7) {
        bw.write(String.format("%.3f\n", pq.poll()))
    }

    bw.flush()
    bw.close()
    close()
}