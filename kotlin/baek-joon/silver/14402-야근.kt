import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var cnt = 0
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        val (name, sign) = readLine().split(" ")
        if (sign == "+") {
            map[name] = map.getOrDefault(name, 0) + 1
        } else {
            val tmp = map.getOrDefault(name, 0)
            if (tmp > 0) {
                map[name] = map.getOrDefault(name, 0) - 1
            } else {
                cnt++
            }
        }
    }

    for (pair in map) {
        cnt += pair.value
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}