import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, h, t) = readLine().split(" ").map { it.toInt() }
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    repeat(n) {
        pq.add(readLine().toInt())
    }

    var cnt = 0

    for (i in 0 until t) {
        if (pq.first() < h || pq.first() == 1) break
        else {
            val tmp = pq.poll() / 2
            pq.add(tmp)
            cnt++
        }
    }

    if (pq.first() >= h) {
        bw.write("NO\n${pq.first()}")
    } else {
        bw.write("YES\n$cnt")
    }
    
    bw.flush()
    bw.close()
    close()
}