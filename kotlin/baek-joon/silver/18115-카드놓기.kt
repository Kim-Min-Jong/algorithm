import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").reversed()
    val deque: Deque<Int> = LinkedList()
    var cardNum = 1

    for (i in list) {
        when (i) {
            "1" -> {
                deque.addFirst(cardNum)
            }

            "2" -> {
                val tmp = deque.removeFirst()
                deque.addFirst(cardNum)
                deque.addFirst(tmp)

            }

            "3" -> {
                deque.addLast(cardNum)
            }
        }
        cardNum++
    }

    bw.write(deque.joinToString(" "))

    bw.flush()
    bw.close()
    close()
}