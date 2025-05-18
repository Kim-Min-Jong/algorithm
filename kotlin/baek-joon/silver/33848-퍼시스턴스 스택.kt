import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val stack = Stack<Int>()
    val addRemoveStack = Stack<Pair<Int, Int>>()

    repeat(t) {
        val commands = readLine().split(" ").map { it.toInt() }

        when(commands[0]) {
            1 -> {
                val value = commands[1]
                addRemoveStack.add(commands[0] to -1)
                stack.add(value)
            }
            2 -> {
                val value = stack.pop()
                addRemoveStack.add(commands[0] to value)
            }
            3 -> {
                val j = commands[1]
                repeat(j) {
                    val query = addRemoveStack.pop()
                    when(query.first) {
                        1 -> {
                            stack.pop()
                        }
                        2 -> {

                            stack.add(query.second)
                        }
                    }
                }
            }
            4 -> {
                bw.write("${stack.size}\n")
            }
            5 -> {
                if (stack.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${stack.peek()}\n")
                }
            }
        }
    }

    closeBW()
    close()
}