import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.PriorityQueue

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var time = 0

    val pq = PriorityQueue<Int>(reverseOrder()).apply {
        readLine().split(" ").map { it.toInt() }.forEach {
            if (it > 1440) {
                bw.write("-1")
                closeBW()
                return@with
            }
            add(it)
        }
    }

    while (pq.isNotEmpty()) {
        val tmp1 = pq.poll()
        val tmp2 = pq.poll() ?: 0
        if (tmp1 - 1 > 0)
            pq.add(tmp1 - 1)
        if (tmp2 - 1 > 0)
            pq.add(tmp2 - 1)
        time++
    }

    bw.write(if (time > 1440) "-1" else "$time")
    closeBW()
    close()
}