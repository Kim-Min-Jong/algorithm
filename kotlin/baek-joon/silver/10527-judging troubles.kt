import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map1 = HashMap<String, Int>()
    val map2 = HashMap<String, Int>()
    var result = 0
    repeat(n) {
        val key = readLine()
        map1[key] = map1.getOrDefault(key, 0) + 1
    }
    repeat(n) {
        val key = readLine()
        map2[key] = map2.getOrDefault(key, 0) + 1
    }

    for (key in map1.keys) {
        if (key in map2) {
            result += min(map1[key]!!, map2[key]!!)
        }
    }

    bw.write("$result")
    
    bw.flush()
    bw.close()
    close()
}