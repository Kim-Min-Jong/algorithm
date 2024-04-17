import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = mutableMapOf<String, Int>()
    var cnt = 0
    var result = 0
    repeat(n) {
        val kid = readLine()
        if (map.getOrDefault(kid, 0) > cnt - map.getOrDefault(kid, 0)) {
            result++
        }
        cnt++
        map[kid] = map.getOrDefault(kid, 0) + 1
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    close()
}