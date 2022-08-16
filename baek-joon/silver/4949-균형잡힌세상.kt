import java.io.*
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    while(true){
        val n = readLine()
        if(n == ".") break
        if(vps(n)) bw.write("yes\n")
        else bw.write("no\n")
    }

    bw.flush()
    bw.close()
    close()
}
fun vps(brackets: String): Boolean{
    val stack = Stack<Char>()
    var ch = ' '
    var openCh = ' '
    for(i in brackets.indices){
        ch = brackets[i]
        when(ch){
            '(','[' -> {
                stack.push(ch)
            }
            ')',']' -> {
                if(stack.isEmpty()) return false
                else{
                   openCh = stack.pop()
                    if(openCh == '(' && ch != ')'
                        || openCh == '[' && ch != ']')
                        return false
                }
            }
        }
    }
    if(stack.isNotEmpty()) return false
    return true
}