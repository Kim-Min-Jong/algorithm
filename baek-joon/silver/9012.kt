import java.util.*
import java.io.*
fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val queue:Queue<Int> = LinkedList<Int>()
    val n = readLine().toInt()
    repeat(n) {
        val m = readLine()
        if(vps(m)) bw.write("YES\n")
        else bw.write("NO\n")
    }
    bw.flush()
    bw.close()
    this.close()
}
fun vps(brackets: String): Boolean{
    val stack = Stack<Char>()
    var ch = ' '
    var openCh = ' '
    for(i in brackets.indices){
        ch = brackets[i]
        when(ch){
            '(' -> {
                stack.push(ch)
            }
            ')' -> {
                if(stack.isEmpty()) return false
                else{
                   openCh = stack.pop()
                    if(openCh == '(' && ch != ')')
                        return false
                }
            }
        }
    }
    if(stack.isNotEmpty()) return false
    return true
}