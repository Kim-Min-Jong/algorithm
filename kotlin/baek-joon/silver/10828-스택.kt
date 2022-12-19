import java.util.*
import java.io.*
fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Int>()
    val n = readLine().toInt()

    repeat(n){
        val m = readLine().split(" ")
        when(m[0]){
            "push" -> {
                stack.push(m[1].toInt())
            }
            "pop" -> {
                if(stack.isNotEmpty()){
                    bw.write("${stack.peek()}\n")
                    stack.pop()
                } else bw.write("-1\n")
            }
            "top" -> {
                if(stack.isNotEmpty()) bw.write("${stack.peek()}\n")
                else bw.write("-1\n")
            }
            "size" -> {
                bw.write("${stack.size}\n")
            }
            "empty" -> {
                if(stack.isEmpty()) bw.write("1\n")
                else bw.write("0\n")
            }
        }
    }

    bw.flush()
    bw.close()
    this.close()
}