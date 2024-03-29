import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

val bw = BufferedWriter(OutputStreamWriter(System.out))
data class Homework(var score: Int, var minute: Int)
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stack = Stack<Homework>()
    var result = 0
    repeat(n) {
        val list = readLine().split(" ").map { it.toInt() }
        when(list[0]) {
            0 -> {
                if (stack.isNotEmpty()) {
                    val tmp = stack.pop()
                    if (--tmp.minute == 0) {
                        result += tmp.score
                    } else {
                        stack.push(tmp)
                    }
                }
            }
            1 -> {
                if (list[2] == 1) {
                    result += list[1]
                } else {
                    stack.push(Homework(list[1], list[2] - 1))
                }
            }
        }
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    close()
}
