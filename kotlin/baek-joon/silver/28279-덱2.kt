import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dq: Deque<Int> = LinkedList<Int>()
    repeat(n) {
        val command = readLine().split(" ").map{it.toInt()}
        when(command.size) {
            2 -> {
                when(command[0]) {
                    1 -> dq.addFirst(command[1])
                    2 -> dq.addLast(command[1])
                }
            }
            else -> {
                when(command[0]) {
                    3 -> {
                        if(dq.isNotEmpty()) bw.write("${dq.pollFirst()}\n")
                        else bw.write("-1\n")
                    }
                    4 -> {
                        if(dq.isNotEmpty()) bw.write("${dq.pollLast()}\n")
                        else bw.write("-1\n")
                    }
                    5 -> bw.write("${dq.size}\n")
                    6 -> {
                        if(dq.isEmpty()) bw.write("1\n")
                        else bw.write("0\n")
                    }
                    7 -> {
                        if(dq.isNotEmpty()) bw.write("${dq.first()}\n")
                        else bw.write("-1\n")
                    }
                    8 -> {
                        if(dq.isNotEmpty()) bw.write("${dq.last()}\n")
                        else bw.write("-1\n")
                    }
                }
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}