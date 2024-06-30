import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stack = Stack<Int>()
    var cnt = 1
    repeat(n) {
        stack.add(readLine().toInt())
    }

    var last = stack.pop()

    while (stack.isNotEmpty()) {
        val tmp = stack.pop()
        if (tmp > last) {
            cnt++
            last = tmp
        }
    }

    bw.write("${cnt}")

    bw.flush()
    bw.close()
    close()
}
