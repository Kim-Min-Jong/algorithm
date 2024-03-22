import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val stack = Stack<Int>()
    var index = 1

    for (i in list) {
        stack.push(i)
        while (stack.isNotEmpty() && stack.last() == index) {
            stack.pop()
            index++
        }
    }

    bw.write(if (stack.isNotEmpty()) "Sad" else "Nice")


    bw.flush()
    bw.close()
    close()
}