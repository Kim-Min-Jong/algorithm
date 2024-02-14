import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = mutableMapOf<String, Long>()
    repeat(n) {
        val (key, value) = readLine().split(" ")
        map[key] = map.getOrDefault(key, 0) + value.toLong()
    }
    map.toList().sortedWith(compareBy<Pair<String, Long>> { it.first.length }.thenBy { it.first }).forEach {
        bw.write("${it.first} ${it.second}\n")
    }

    bw.flush()
    bw.close()
    close()
}