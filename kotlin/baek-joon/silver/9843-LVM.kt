import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.Stack
import java.util.StringTokenizer

data class MutablePair<T1, T2>(var first: T1, var second: T2)
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val stack = Stack<Int>()
    val n = readLine().toInt()
    var register = 0
    val commandList = mutableListOf<MutablePair<String, Int>>()

    for (i in 0 until n) {
        val st = StringTokenizer(readLine())
        commandList.add(MutablePair(st.nextToken(), if (st.hasMoreTokens()) st.nextToken().toInt() else 0))
    }

    var i = 0

    while(i < n) {
        when(commandList[i].first) {
            "DONE" -> {
                bw.write("${stack.peek()}\n")
                break
            }
            "PUSH" -> stack.push(commandList[i].second)
            "STORE" -> register = stack.pop()
            "LOAD" -> stack.push(register)
            "PLUS" -> stack.push(stack.pop() + stack.pop())
            "TIMES" -> stack.push(stack.pop() * stack.pop())
            "IFZERO" -> {
                if (stack.pop() == 0) {
                    i = commandList[i].second - 1
                }
            }
        }
        i++
    }

    bw.flush()
    bw.close()
    close()
}