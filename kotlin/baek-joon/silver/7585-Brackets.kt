import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        val str = readLine()
        if (str == "#") break

        bw.write(if (isLegal(str)) "Legal\n" else "Illegal\n")
    }

    bw.flush()
    bw.close()
    close()
}
fun isLegal(str: String): Boolean {
    val stack = Stack<Char>()
    str.forEach {
        when (it) {
            '{', '(', '[' -> {
                stack.push(it)
            }
            '}' -> {
                if (stack.pop() != '{') {
                    return false
                }
            }
            ')' -> {
                if (stack.pop() != '(') {
                    return false
                }
            }
            ']' -> {
                if (stack.pop() != '[') {
                    return false
                }
            }
        }
    }
    return stack.isEmpty()
}
