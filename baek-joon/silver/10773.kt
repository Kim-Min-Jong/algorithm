import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val stack = Stack<Int>()
    repeat(n){
        var m = readLine().toInt()
        if(m != 0){
            stack.add(m)
        }else{
            stack.pop()
        }
    }
    bw.write("${stack.sum()}")

    bw.flush()
    bw.close()
    this.close()
}