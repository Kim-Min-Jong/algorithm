import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (t, s) = readLine().split(" ").map { it.toInt() }
        list.add(t to s)
    }
    var time = Int.MAX_VALUE

    list.sortedByDescending { it.second }.forEach {
        time = min(time, it.second)
        time -= it.first
    }

    bw.write("${if (time >= 0) time else "-1"} ")
    
    bw.flush()
    bw.close()
    close()
}