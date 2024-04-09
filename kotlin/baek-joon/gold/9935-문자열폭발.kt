import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val explosiveStr = readLine()
    val stack = Stack<Char>()

    for (i in 0 until str.length) {
        stack.push(str[i])
        if (stack.size >= explosiveStr.length) {
            var isDuplicate = true
            for (j in 0 until explosiveStr.length) {
                if (explosiveStr[j] != stack[stack.size - explosiveStr.length + j]) {
                    isDuplicate = false
                    break
                }
            }
            if (isDuplicate) {
                repeat(explosiveStr.length) { stack.pop() }
            }
        }
    }

    bw.write(if (stack.isEmpty()) "FRULA" else stack.joinToString(""))

    bw.flush()
    bw.close()
    close()
}