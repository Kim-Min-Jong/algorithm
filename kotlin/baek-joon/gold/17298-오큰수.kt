import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.Stack 

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val stack = Stack<Int>()
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val answer = IntArray(n) { 0 }

    stack.push(0)

    for (i in 1 until n) {
        while (stack.isNotEmpty() && list[stack.peek()] < list[i]) {
            answer[stack.pop()] = list[i]
        }
        stack.push(i)
    }

    while (stack.isNotEmpty()) {
        answer[stack.pop()] = -1
    }

    answer.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()
}