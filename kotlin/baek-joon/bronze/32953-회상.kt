import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun closeBW() {
    bw.flush()
    bw.close()
}
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = hashMapOf<Int, Int>()
    repeat(n) {
        val x = readLine().toInt()
        val list = readLine().split(" ").map { it.toInt() }
        list.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
    }

    bw.write("${map.filter { it.value >= m }.count()}")
    closeBW()
    close()
}