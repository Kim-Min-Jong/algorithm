import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val queue:Queue<Int> = LinkedList<Int>()
    val n = readLine().toInt()
    var rearValue = 0
    repeat(n){
        val m = readLine().split(" ")
        when(m[0]){
            "push" -> {
                queue.add(m[1].toInt())
                rearValue = m[1].toInt()
            }
            "pop" -> {
                if(queue.isEmpty()) bw.write("-1\n")
                else bw.write("${queue.poll()}\n")
            }
            "size" -> {
                bw.write("${queue.size}\n")
            }
            "empty" -> {
                if(queue.isEmpty()) bw.write("1\n")
                else bw.write("0\n")
            }
            "front" -> {
                if(queue.isEmpty()) bw.write("-1\n")
                else bw.write("${queue.peek()}\n")

            }
            "back" -> {
                if(queue.isEmpty()) bw.write("-1\n")
                else bw.write("$rearValue\n")
            }
        }
    }
    bw.flush()
    bw.close()
    this.close()
}