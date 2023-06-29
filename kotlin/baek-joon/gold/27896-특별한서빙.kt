import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toLong()}
    val list = readLine().split(" ").map{it.toLong()}
    val pq = PriorityQueue<Long>(Collections.reverseOrder())
    var sum = 0L
    var cnt = 0
    list.forEach{
        pq.add(it)
        sum += it
        while(sum >= m) {
            cnt++
            sum -= pq.poll()*2
        }
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}