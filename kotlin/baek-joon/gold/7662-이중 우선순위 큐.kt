import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception
import java.lang.StringBuilder
import java.math.BigInteger
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayDeque
import kotlin.collections.HashMap
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
val list = mutableListOf<Int>()
lateinit var result: Array<String>
lateinit var map: HashMap<Long, Long>
const val INF = 10000000
data class MutablePair<T1, T2>(var first: T1, var second: T2)
fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    for(i in 0 until t) {
        val n = readLine().toInt()
        val maxHeap = PriorityQueue<Int>(Collections.reverseOrder())
        val minHeap = PriorityQueue<Int>()
        for(j in 0 until n) {
            val (command, num) = readLine().split(" ")
            val intNum = num.toInt()
            when(command) {
                    "I" -> {
                        maxHeap.add(intNum)
                        minHeap.add(intNum)
                    }
                    "D" -> {
                        when(intNum) {
                            1 -> {
                                val tmp = maxHeap.poll()
                                minHeap.remove(tmp)
                            }
                            -1 -> {
                                val tmp = minHeap.poll()
                                maxHeap.remove(tmp)
                            }
                        }
                    }
                }
        }
        if(maxHeap.size == 1 && minHeap.size == 1){
            bw.write("EMPTY\n")
        } else {
            bw.write("${maxHeap.first()} ${minHeap.first()}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
} // 시간초과.. 큐 두개 때문에? - remove -> O(N)의 복잡도..