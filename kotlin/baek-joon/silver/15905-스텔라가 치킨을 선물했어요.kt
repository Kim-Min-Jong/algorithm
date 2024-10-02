import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    var ans = 0

    repeat(n) {
        val (cnt, penalty) = readLine().split(" ").map { it.toInt() }
        list.add(cnt to penalty)
    }

    list.sortWith(compareByDescending<Pair<Int, Int>> { it.first }.thenBy { it.second })

    val fifth = list[4]

    for (i in 5 until list.size) {
        if (fifth.first == list[i].first) ans++
        else break
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
    close()
}