import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    val pq = PriorityQueue<Int>(Collections.reverseOrder()).apply {
        repeat(n) {
            add(readLine().toInt())
        }
    }
    val satisfactionList = mutableListOf<Int>()
    var satisfaction = 0
    while (pq.isNotEmpty()) {
        val todayJob = pq.poll()
        if (todayJob <= k) continue
        val todaySatisfaction = satisfaction / 2 + todayJob
        satisfaction = todaySatisfaction
        pq.add(todayJob - m)
        satisfactionList.add(satisfaction)
    }

    satisfactionList.run {
        bw.write("$size\n")
        forEach {
            bw.write("$it\n")
        }
    }

    closeBW()
    close()
}