import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val queue: Queue<Int> = LinkedList<Int>()
    val n = readLine().toInt()
    val sb = StringBuilder()
    for(i in 1..n){
        queue.add(i)
    }
    while(queue.size != 1){
        sb.append(queue.poll().toString() + " ")
        queue.add(queue.poll())
    }
    bw.write("${sb}${queue.poll()}")

    bw.flush()
    bw.close()
    close()
}