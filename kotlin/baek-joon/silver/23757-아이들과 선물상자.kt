import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val presents = readLine().split(" ").map { it.toInt() }
    val wants = readLine().split(" ").map { it.toInt() }
    val pq = PriorityQueue<Int>(Collections.reverseOrder()).apply {
        presents.forEach { present -> add(present) }
    }
    var clear = true

    for (want in wants) {
        val tmp = pq.poll()
        when {
            tmp > want -> pq.add(tmp - want)
            tmp == want -> continue
            else -> {
                clear = false
                break
            }
        }
    }
    
    bw.write(if (clear) "1" else "0")

    bw.flush()
    bw.close()
    close()
}