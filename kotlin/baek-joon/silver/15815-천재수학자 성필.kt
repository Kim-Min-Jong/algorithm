import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().toCharArray()
    val stack = Stack<Int>()

    for (i in input.indices) {
        when {
            input[i] >= '0' -> {
                stack.push(input[i] - '0')
            }
            else -> {
                val op1 = stack.pop()
                val op2 = stack.pop()
                when(input[i]) {
                    '+' -> stack.push(op2 + op1)
                    '-' -> stack.push(op2 - op1)
                    '/' -> stack.push(op2 / op1)
                    '*' -> stack.push(op2 * op1)
                }
            }
        }
    }

    bw.write("${stack.pop()}")

    bw.flush()
    bw.close()
    close()
}