import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int,Int>>()
    var sum = 0
    repeat(n) {
        val (start, end) = readLine().split(" ").map { it.toInt() }
        list.add(start to end)
    }
    list.sortBy { it.first }
    for (i in 0 until n) {
        if(sum < list[i].first) {
            sum = list[i].first + list[i].second
        } else {
            sum += list[i].second
        }
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}