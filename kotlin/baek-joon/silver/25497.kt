import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val command = readLine()
    val skStack = Stack<Char>()
    val lrStack = Stack<Char>()
    var result = 0

    for (c in command) {
        when(c) {
            'L' -> {
                lrStack.push(c)
            }
            'R' -> {
                if (lrStack.isNotEmpty()) {
                    lrStack.pop()
                    result++
                } else break
            }
            'S' -> {
                skStack.push(c)
            }
            'K' -> {
                if(skStack.isNotEmpty()) {
                    skStack.pop()
                    result++
                } else break
            }
            else -> result++
        }
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    close()
}