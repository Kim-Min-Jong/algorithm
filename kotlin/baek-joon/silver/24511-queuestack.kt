import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val aList = readLine().split(" ").map { it.toInt() }
    val bList = readLine().split(" ").map { it.toInt() }
    val m = readLine().toInt()
    val cList = readLine().split(" ").map { it.toInt() }

    val answer: Deque<Int> = LinkedList()

    aList.forEachIndexed { index, num ->
        if (num == 0) {
            answer.addFirst(bList[index])
        }
    }

    cList.forEachIndexed { index , _ ->
        answer.add(cList[index])
        bw.write("${answer.pollFirst()} ")
    }

    bw.flush()
    bw.close()
    close()
}