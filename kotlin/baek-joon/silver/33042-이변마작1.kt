import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ")
    val map = hashMapOf<String, Int>()
    var answer = 0

    list.forEachIndexed { idx, s ->
        map[s] = map.getOrDefault(s, 0) + 1
        if (map[s]!! >= 5) {
            answer = idx + 1
            bw.write("$answer")  
            closeBW()
            close()
            return@with
        }
    }

    bw.write("0")

    closeBW()
    close()
}