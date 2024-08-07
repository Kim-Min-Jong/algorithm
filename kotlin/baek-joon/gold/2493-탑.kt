import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.Stack
val bw = BufferedWriter(OutputStreamWriter(System.out))

data class Tower(val index: Int, val height: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val stack = Stack<Tower>()

    list.forEachIndexed { index, height ->
        while (true) {
            if (stack.isEmpty()) {
                bw.write("0 ")
                stack.push(Tower(index, height))
                break
            }
            val top = stack.peek()

            if (height < top.height) {
                bw.write("${top.index + 1} ")
                stack.push(Tower(index, height))
                break
            } else {
                stack.pop()
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}