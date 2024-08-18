import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.Stack

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val stack = Stack<String>()
    val n = readLine().toInt()

    repeat(n) {
        when(val str = readLine()) {
            "READ" -> {
                bw.write("${stack.pop()}\n")
            }
            else -> {
                stack.add(str)
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}
