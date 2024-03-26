import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dq: Deque<Int> = LinkedList<Int>().apply {
        add(n)
    }

    for (i in n - 1 downTo 1) {
        dq.addFirst(i)
        for (j in 0 until i) {
            dq.addFirst(dq.pollLast())
        }
    }

    dq.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()
}