import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val t = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val numList = readLine().split(" ").map { it.toInt() }
    val deque: Deque<Int> = LinkedList<Int>().apply {
        list.forEach {
            add(it)
        }
    }
    numList.forEach { num ->
        repeat(num - 1) {
            deque.addLast(deque.pollFirst())
        }
        bw.write("${deque.first()} ")
    }

    closeBW()
    close()
}