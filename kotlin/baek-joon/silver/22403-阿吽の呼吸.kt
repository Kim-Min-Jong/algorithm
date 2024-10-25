import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.Stack

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stack = Stack<String>()
    var ans = "YES"
    
    repeat(n) {
        val str = readLine()
        
        if (str == "A") {
            stack.add("A")
        } else {
            if (stack.isEmpty()) ans = "NO"
            else stack.pop()
        }
    }
    
    if (stack.isNotEmpty()) ans = "NO"
    
    bw.write(ans)

    bw.flush()
    bw.close()
    close()
}