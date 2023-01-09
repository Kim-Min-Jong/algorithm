import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int,Int>>()
    val dp = IntArray(n){1}
    repeat(n) {
        val (a, b) = readLine().split(" ").map{it.toInt()}.sorted()
        list.add(Pair(a,b))
    }
    list.sortWith(compareBy<Pair<Int, Int>> {it.first}.thenBy { it.second })
    list.reverse()
    println(list)
    for(i in 0 until n) {
        for(j in 0 until i) {
            if (list[i].second <= list[j].second)
                dp[i] = Math.max(dp[i], dp[j]+1)
        }
    }
    bw.write("${dp.maxOrNull()}")

    bw.flush()
    bw.close()
    close()
}