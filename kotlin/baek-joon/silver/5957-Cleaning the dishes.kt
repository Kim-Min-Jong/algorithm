import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
        val notWashed = Stack<Int>()
    val washed = Stack<Int>()
    val done = Stack<Int>()
    var num = 1
        for (i in n downTo 1) notWashed.push(i)
    while (true) {
        val list = readLine() ?: break
        var (command, cnt) = list.split(" ").map { it.toInt() }
        if (command == 1) {
            while (cnt != 0) {
                washed.push(notWashed.pop())
                cnt--
            }
        } else {
            while (cnt != 0) {
                done.push(washed.pop())
                cnt--
            }
        }
    }
    while (done.isNotEmpty()) {
        bw.write("${done.pop()}\n")
    }

    closeBW()
    close()
}