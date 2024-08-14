import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val deque: Deque<Int> = LinkedList<Int>()
    val (n, k, m) = readLine().split(" ").map { it.toInt() }

    (1..n).forEach {
        deque.add(it)
    }

    var cnt = 0
    var rotate = true

    while (deque.isNotEmpty()) {
        cnt++
        when (rotate) {
            true -> {
                repeat(k - 1) {
                    deque.addLast(deque.pollFirst())
                }
                bw.write("${deque.peekFirst()}\n")
                deque.pollFirst()
            }

            false -> {
                repeat(k - 1) {
                    deque.addFirst(deque.pollLast())
                }
                bw.write("${deque.peekLast()}\n")
                deque.pollLast()
            }
        }
        if (cnt % m == 0) {
            rotate = rotate.not()
        }
    }
    
    bw.flush()
    bw.close()
    close()
}
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val deque: Deque<Int> = LinkedList<Int>()
    val (n, k, m) = readLine().split(" ").map { it.toInt() }

    (1..n).forEach {
        deque.add(it)
    }

    var cnt = 0
    var rotate = true

    while (deque.isNotEmpty()) {
        cnt++
        when (rotate) {
            true -> {
                repeat(k - 1) {
                    deque.addLast(deque.pollFirst())
                }
                bw.write("${deque.peekFirst()}\n")
                deque.pollFirst()
            }

            false -> {
                repeat(k - 1) {
                    deque.addFirst(deque.pollLast())
                }
                bw.write("${deque.peekLast()}\n")
                deque.pollLast()
            }
        }
        if (cnt % m == 0) {
            rotate = rotate.not()
        }
    }
    
    bw.flush()
    bw.close()
    close()
}
