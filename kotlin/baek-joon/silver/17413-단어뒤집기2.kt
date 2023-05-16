import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val stack = Stack<Char>()
    var chk = false

    for(i in str.indices) {
        // 새로운 꺽쇠시작 - 이전거 다 출력
        if(str[i] == '<') {
            chk = true
            printAll(stack)
            bw.write(str[i].toString())
        } else if(str[i] == '>') { // 닫는 꺽쇠 - 다시 열기 위해 chk 조정
            // 꺽쇠 안쪽 그대로 출력
            chk = false
            bw.write(str[i].toString())
        } else if(chk) { // 꺽쇠 사이 - 그대로 출력
            bw.write(str[i].toString())
        } else if(!chk) { // 꺽쇠 바깥
            if(str[i] == ' ') {
                printAll(stack)
                bw.write(str[i].toString())
            } else {
                stack.push(str[i])
            }
        }
        printAll(stack)
    }


    bw.flush()
    bw.close()
    close()
}
fun printAll(stack: Stack<Char>) {
    while(stack.isNotEmpty()) {
        bw.write(stack.pop().toString())
    }
}