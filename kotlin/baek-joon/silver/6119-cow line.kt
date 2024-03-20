import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val deque: Deque<Int> = LinkedList()
    var num = 1
    repeat(n) {
        val command = readLine().split(" ")
        when(command[0]) {
            "A" -> {
                when(command[1]) {
                    "L" -> deque.addFirst(num++)
                    "R" -> deque.addLast(num++)
                }
            }
            "D" -> {
                when(command[1]) {
                    "L" -> {
                        repeat(command[2].toInt()) {
                            deque.pollFirst()
                        }
                    }
                    "R" -> {
                        repeat(command[2].toInt()) {
                            deque.pollLast()
                        }
                    }
                }
            }
        }
    }

    deque.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
    close()
}
