import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    var win = readLine().toInt()
    var result = 0
    repeat(n - 1) {
        pq.add(readLine().toInt())
    }
    when(n) {
        1 -> bw.write("0")
        else -> {
            while (win <= pq.peek()) {
                var tmp = pq.poll()
                tmp -= 1
                win += 1
                pq.add(tmp)
                result += 1
            }
        }
        bw.write("$result")
    }

    bw.flush()
    bw.close()
    close()
}