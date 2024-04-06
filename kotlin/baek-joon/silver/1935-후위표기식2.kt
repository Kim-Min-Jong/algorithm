import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val input = readLine().toCharArray()

    val operands = input.filter { it in 'A'..'Z' }.toSortedSet().toList()
    val opNumList = mutableListOf<Int>()
    val operandMap = mutableMapOf<Char, Int>()
    val stack = Stack<Double>()

    repeat(n) {
        opNumList.add(readLine().toInt())
    }

    for (i in 0 until n) {
        operandMap[operands[i]] = opNumList[i]
    }

    for (i in input.indices) {
        when {
            input[i] in 'A'..'Z' -> {
                stack.push(operandMap[input[i]]!!.toDouble())
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

    bw.write(String.format("%.2f", stack.pop()))

    bw.flush()
    bw.close()
    close()
}