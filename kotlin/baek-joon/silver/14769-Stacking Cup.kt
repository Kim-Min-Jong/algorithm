import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Pair<String, Int>>()
    repeat(n) {
        val (first, second) = readLine().split(" ")
        val tmp = try {
            first.toInt()
        } catch (e: Exception) {
            first
        }

        if (tmp is String) {
            list.add(tmp to second.toInt())
        } else {
            list.add(second to first.toInt() / 2)
        }
    }
    list.sortedBy { it.second }.forEach {
        bw.write("${it.first}\n")
    }
    bw.flush()
    bw.close()
    close()
}