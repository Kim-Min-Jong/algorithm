import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val commandDq: Deque<Int> = LinkedList()
    val dq: Deque<String> = LinkedList()
    for (i in 0 until n) {
        val commandList = readLine().split(" ")
        when(commandList.size) {
            1 -> {
                if (dq.isEmpty()) continue

                val tmp = commandDq.pollFirst()
                if (tmp == 2)
                    dq.pollFirst()
                else if(tmp == 1)
                    dq.pollLast()
            }
            2 -> {
                val idx = commandList[0].toInt()
                when(idx) {
                    1 -> {
                        dq.addLast(commandList[1])
                    }
                    2 -> {
                        dq.addFirst(commandList[1])
                    }
                }
                commandDq.addFirst(idx)
            }
        }
    }
    if (dq.isEmpty()) {
        bw.write("0")
    } else {
        dq.forEach {
            bw.write(it)
        }
    }

    bw.flush()
    bw.close()
    close()
}