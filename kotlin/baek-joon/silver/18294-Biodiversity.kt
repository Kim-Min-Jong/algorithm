import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = hashMapOf<String, Int>()
    var max = 0
    var result = ""
    repeat(n) {
        val name = readLine()
        map[name] = map.getOrDefault(name, 0) + 1

        if (map[name]!! > max) {
            max = map[name]!!
            result = name
        }
    }

    bw.write(if (max > n / 2) result else "NONE")

    bw.flush()
    bw.close()
    close()
}