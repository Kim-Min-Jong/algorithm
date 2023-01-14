import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.lang.Integer.max
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int,Int>>()
    val dp = IntArray(n){0}
    repeat(n) {
        val (a,b) = readLine().split(" ").map{it.toInt()}
        list.add(Pair(a,b))
    }
    // 순서대로 정렬
    list.sortBy { it.first }

    for(i in 0 until list.size) {
        dp[i] = 1
        for(j in 0 until i) {
            if(list[i].second > list[j].second)
                dp[i] = max(dp[i], dp[j]+1)
        }
    }
    bw.write("${n- dp.maxOrNull()!!}")

    bw.flush() 
    bw.close()
    close()
}
