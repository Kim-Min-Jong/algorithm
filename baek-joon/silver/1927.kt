import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    var n = readLine().toInt()
    val minHeap = PriorityQueue<Long>()

    repeat(n){
        val m = readLine().toLong()
        when(m){
            0L ->{
                if(minHeap.isEmpty()) bw.write("0\n")
                else{
                    bw.write("${minHeap.remove()}\n")
                }
            }
            else ->{
                minHeap.add(m)
            }
        }
    }

    bw.flush()
    bw.close()
    this.close()
}