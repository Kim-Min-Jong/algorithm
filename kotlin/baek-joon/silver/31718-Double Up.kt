import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.collections.HashMap
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = hashMapOf<Int, Int>()
    val list = readLine().split(" ").map { it.toInt() }
    var res = 0
    list.forEach {
        var tmp  = it
        while (tmp % 2 == 0) {
            tmp /= 2
        }
        map[tmp] = map.getOrDefault(tmp, 0) + 1
        res = max(map[tmp]!!, res)
    }

    bw.write("$res")

    closeBW()
    close()
}