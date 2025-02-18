import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val deque: Deque<Int> = LinkedList()
    val (n, k) = readLine().split(" ").map { it.toInt() }
    (1..n).forEach {
        deque.add(it)
    }
    val list = readLine().toCharArray()

    list.forEach {
        when (it) {
            'A' -> {
                deque.addLast(deque.pollFirst())
            }
            'B' -> {
                val first = deque.pollFirst()
                val second = deque.pollFirst()
                deque.addFirst(first)
                deque.addLast(second)
            }
        }
    }

    bw.write("${deque.first}")

    closeBW()
    close()
}