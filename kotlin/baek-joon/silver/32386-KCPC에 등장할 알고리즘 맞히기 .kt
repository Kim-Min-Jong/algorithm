import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()
    val map = hashMapOf<String, Int>()

    repeat(tc) {
        val list = readLine().split(" ")
        for (i in 2 until list.size) {
            map[list[i]] = map.getOrDefault(list[i], 0) + 1
        }
    }

    val list = map.toList()
    val max = list.maxOf { it.second }
    val filtered =  list.filter { it.second == max }

    if (filtered.size > 1) {
        bw.write("-1")
    } else {
        bw.write(filtered.first().first)
    }

    bw.flush()
    bw.close()
    close()
}