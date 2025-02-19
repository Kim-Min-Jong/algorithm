import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashMap

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val map = hashMapOf<String, Int>()
    val n = readLine().toInt()

    repeat(n) {
        val (name, value) = readLine().split(" ")
        map[name] = map.getOrDefault(name, 0) + value.toInt()
    }

    map.toList().sortedBy { it.first }.forEach {
        bw.write("${it.first} ${it.second}\n")
    }

    closeBW()
    close()
}