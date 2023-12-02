import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.collections.ArrayDeque
import kotlin.math.abs

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {

    val sb = StringBuilder()
    val n = readLine().toInt()
    val list = readLine().split(" ")
    val deque = ArrayDeque((1..n).map {
        list[it-1].toInt() to it
    })

    sb.append(1).append(" ")
    var pivot = deque.removeFirst().first
    while(deque.isNotEmpty()) {
        if (pivot > 0) {
            repeat(pivot - 1) {
                deque.addLast(deque.removeFirst())
            }
            pivot = deque.first().first
            sb.append(deque.removeFirst().second).append(" ")
        } else {
            repeat(abs(pivot) - 1) {
                deque.addFirst(deque.removeLast())
            }
            pivot = deque.first().second
            sb.append(deque.removeLast().second).append(" ")
        }
    }
    bw.write("${sb.deleteCharAt(sb.lastIndex)}")

    bw.flush()
    bw.close()
    close()

} // 메모리 초과 수정 중..