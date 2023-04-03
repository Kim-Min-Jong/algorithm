import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val arr = Array<Long>(n){0}
    for(i in 0 until n){
        arr[i] = readLine().toLong()
    }
    val map = arr.groupBy { it }.map{it.key to it.value.size}.sortedWith(compareByDescending<Pair<Long, Int>> {it.second}.thenBy{it.first})
    bw.write("${map[0].first}")

    bw.flush()
    bw.close()
    close()
}