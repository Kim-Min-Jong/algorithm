import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Long, Long>>()
    repeat(n) {
        val (a, b) = readLine().split(" ").map{it.toLong()}
        list.add(Pair(a, b))
    }
    list.sortBy { it.first }
    var sum = 0L
    list.forEachIndexed { idx, it ->
        sum += (it.first * (idx+1)) + it.second
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}