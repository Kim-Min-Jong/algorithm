import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.HashMap

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val m = readLine().toInt()

    var cnt = 0

    val map = hashMapOf<Int, Boolean>()
    for (i in list.indices) {
        val tmp = list[i] / m
        if (map.getOrDefault(tmp, false).not()) {
            cnt++
        }
        map[tmp] = true
    }
    
    bw.write("$cnt")

    closeBW()
    close()
}