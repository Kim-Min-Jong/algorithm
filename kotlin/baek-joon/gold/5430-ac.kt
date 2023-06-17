import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    repeat(t) {
        val p = readLine()
        val n = readLine().toInt()
        val arr = readLine().removeSuffix("]").removePrefix("[")
        val arr2 = if (arr.isEmpty()) intArrayOf() else arr.split(",").map { it.toInt() }.toIntArray()
        val deque: Deque<Int> = LinkedList<Int>()
        arr2.forEach {
            deque.add(it)
        }
        bw.write(printDeque(deque, p))
    }

    bw.flush()
    bw.close()
    close()
}
fun printDeque(deque: Deque<Int>, p: String): String {
    var isReversed = true
    val sb = StringBuilder()
    for (i in p) {
        when (i) {
            'R' -> isReversed = !isReversed
            'D' -> {
                if (deque.isEmpty()) {
                    return "error\n"
                }
                when (isReversed) {
                    true -> deque.pollFirst()
                    false -> deque.pollLast()
                }
            }
        }
    }
    sb.append("[")
    while(deque.isNotEmpty()) {
        when(isReversed) {
            true -> sb.append(deque.pollFirst())
            false -> sb.append(deque.pollLast())
        }
        if(deque.size != 0) sb.append(",")
    }
    sb.append("]\n")
    return sb.toString()
}