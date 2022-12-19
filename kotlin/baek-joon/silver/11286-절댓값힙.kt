import java.io.*
import java.util.*
import kotlin.math.abs
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val minHeap = PriorityQueue<Int>()
    val maxHeap = PriorityQueue<Int>{a,b->b.compareTo(a)}
    val n = readLine().toInt()
    repeat(n){
        val m = readLine().toInt()
        when(m){
            0 -> {
                var tmp=0
                if(!minHeap.isEmpty() || !maxHeap.isEmpty()){
                    tmp = when {
                        minHeap.isEmpty() -> maxHeap.poll()
                        maxHeap.isEmpty() -> minHeap.poll()
                        else -> if(abs(minHeap.peek()) < abs(maxHeap.peek())) minHeap.poll() else maxHeap.poll()
                    }
                }
                bw.write("$tmp\n")
            }
            !in 1..Integer.MAX_VALUE -> maxHeap.add(m)
            else -> minHeap.add(m)
        }
    }

    bw.flush()
    bw.close()
    close()
}