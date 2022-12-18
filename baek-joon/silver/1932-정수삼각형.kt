import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import java.lang.Integer.max

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<IntArray>()
    var a = 2 // 2층부터 값찾기
    repeat(n) {
        val tmp = readLine().split(" ").map{it.toInt()}.toIntArray()
        list.add(tmp)
    }
    for(i in 1 until n) {
        for(j in 0 until a) {
            when{
                j == 0 -> {
                    list[i][j] = list[i][j] + list[i-1][j]
                }
                i == j -> {
                    list[i][j] = list[i][j] + list[i-1][j-1]
                }
                else -> {
                    list[i][j] = max(list[i-1][j], list[i-1][j-1]) + list[i][j]
                }
            }
        }
        a++
    }
    bw.write("${list[n-1].maxOrNull()}")
    bw.flush()
    bw.close()
    close()
}