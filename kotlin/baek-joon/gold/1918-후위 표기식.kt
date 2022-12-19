import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))
val stack = Stack<String>()
fun main() = with(System.`in`.bufferedReader()){
    val a = readLine()

    infix2postfix(a)

    bw.flush()
    bw.close()
    this.close()
}
// 후위변환
fun infix2postfix(ll: String){
    val list = ll.chunked(1)
    val len = list.size
    var ch = " "
    var top_op = " "
    for(i in 0 until len){
        ch = list[i]
        when(ch){
            "+","-","*","/" -> {
                while(stack.isNotEmpty() && (prec(ch) <= prec(stack.peek())))
                    bw.write(stack.pop())
                stack.push(ch)
            }
            "(" -> {
                stack.push(ch)
            }
            ")" -> {
                top_op = stack.pop()
                while(top_op != "("){
                    bw.write(top_op)
                    top_op = stack.pop()
                }
            }
            else -> {
                bw.write(ch)
            }
        }
    }
    while(stack.isNotEmpty()){
        bw.write(stack.pop())
    }
}
// 후위식 연산자 우선순위
fun prec(op:String): Int{
    return when(op){
        "(",")" -> 0
        "+","-" -> 1
        "*","/" -> 2
        else -> -1
    }
}
