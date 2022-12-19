import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val stack = Stack<Char>()
    var cnt = 0

    for (ch in str) {
        if (ch == '(') {
            stack.push(ch)
        } else {
            if (stack.size != 0 && stack.last() == '(') {
                stack.pop()
            } else { // ) 만있을때
                cnt++
            }
        }
    } 
    
    // 스택에 남은 ( 를 위해 스택 크기만큼 추가
    bw.write("${cnt + stack.size}")

    bw.flush()
    bw.close()
    close()
}