import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()

    for (i in 1..tc) {
        val n = readLine().toInt()
        val list = readLine().split(" ").map { it.toInt() }
        val map = hashMapOf<Int, Int>().apply {
            list.toSet().forEach {
                this[it] = 0
            }
        }
        var cnt = 0

        list.forEach { value ->
            if (map.values.all { it >= 1 }) return@forEach
            map[value] = map.getOrDefault(value, 0) + 1
            cnt++
        }

        bw.write("Case $tc: $cnt\n")
    }


    bw.flush()
    bw.close()
    close()
}