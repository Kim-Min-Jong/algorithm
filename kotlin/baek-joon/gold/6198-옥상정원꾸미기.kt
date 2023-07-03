import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stack = Stack<Int>()
    var cnt = 0L
    for(i in 0 until n) {
        val height = readLine().toInt()
        while(stack.isNotEmpty() && stack.peek() <= height)
            stack.pop()
        cnt += stack.size
        stack.push(height)
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}