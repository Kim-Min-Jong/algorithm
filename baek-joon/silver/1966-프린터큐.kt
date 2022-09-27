import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    repeat(n){
        var answer = 1
        val (a, b) = readLine().split(" ").map{it.toInt()}
        val priorities = readLine().split(" ").map{it.toInt()}
        val pq = PriorityQueue(Comparator.reverseOrder<Int>()) // priorities 값
        for (i in priorities) {
            pq.offer(i)
        }
        while (!pq.isEmpty()) {
            for (i in priorities.indices) {
                if (priorities[i] == pq.peek()) {
                    if (b == i) {
                        bw.write("$answer\n")
                    }
                    answer++
                    pq.poll()
                }
            }
        }
        
    }
    bw.flush()
    bw.close()
    close()
}