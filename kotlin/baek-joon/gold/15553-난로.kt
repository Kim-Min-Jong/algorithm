import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val list = mutableListOf<Long>()
    var sub = mutableListOf<Long>()
    repeat(n) {
        list.add(readLine().toLong())
    }
    list.sort()
    // 최소로만 하기위해 각 사이의 차를 구해 정렬
    for(i in 0 until list.size - 1) {
        sub.add(list[i+1] - list[i])
    }
    sub.sort()
    
    val minSubList = sub.subList(0, list.size - m).toMutableList()

    repeat(m) {
        minSubList.add(1)
    }

    bw.write("${minSubList.sum()}")

    bw.flush()
    bw.close()
    close()
}