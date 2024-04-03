import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue


val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val pq = PriorityQueue<Long>()
    readLine().split(" ").map { it.toLong() }.run {
        pq.addAll(this)
    }

    repeat(m) {
        val tmp1 = pq.poll()
        val tmp2 = pq.poll()
        repeat(2) { pq.add(tmp1 + tmp2) }
    }
    bw.write("${pq.sum()}")
    
    bw.flush()
    bw.close()
    close()
}