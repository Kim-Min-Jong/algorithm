import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.Stack

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var cnt = 0
    repeat(n) {
        val str = readLine()
        val stack = Stack<Char>()

        for (c in str) {
            if (stack.isNotEmpty() && stack.last() == c )
                stack.pop()
            else stack.push(c)
        }
        if (stack.isEmpty()) cnt++

    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}