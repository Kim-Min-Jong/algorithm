import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    for(i in 0 until n) {
        val st = StringTokenizer(readLine())
        when(val a = st.nextToken().toInt()) {
            0 -> {
                if(pq.isEmpty()) bw.write("-1\n")
                else {
                    bw.write("${pq.poll()}\n")
                }
            }
            else -> {
                for(i in 0 until a){
                    pq.add(st.nextToken().toInt())
                }
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}