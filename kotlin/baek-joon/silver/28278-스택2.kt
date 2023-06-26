import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stack = Stack<Int>()
    repeat(n) {
        val command = readLine().split(" ").map{it.toInt()}
        when(command.size) {
            2 -> {
                stack.push(command[1])
            }
            else -> {
                when(command[0]) {
                    2 -> {
                        if (stack.isNotEmpty()) bw.write("${stack.pop()}\n")
                        else bw.write("-1\n")
                    }

                    3 -> bw.write("${stack.size}\n")
                    4 -> {
                        if (stack.isEmpty()) bw.write("1\n")
                        else bw.write("0\n")
                    }
                    5 -> {
                        if (stack.isNotEmpty()) bw.write("${stack.peek()}\n")
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