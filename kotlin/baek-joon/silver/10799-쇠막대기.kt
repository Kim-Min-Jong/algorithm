import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val pipe = readLine()
    val stack = Stack<Char>()
    var cnt = 0
    for(i in pipe.indices) {
        when(pipe[i]) {
            '(' -> {
                stack.push(pipe[i])
            }
            else -> {
                stack.pop()
                when(pipe[i-1]) {
                    // 레이저
                    '(' -> {
                        cnt += stack.size
                    }
                    // 파이프 끝
                    else -> cnt++
                }
            }
        }
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}