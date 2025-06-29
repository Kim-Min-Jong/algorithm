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
    val (n, m) = readLine().split(" ").map { it.toInt() }
    var cnt = 0
    repeat(n) {
        val (name, price) = readLine().split(" ")
        map[name] = price.toInt()
    }

    repeat(m) {
        val (name, newPrice) = readLine().split(" ")
        if (map[name]!! * 105 < newPrice.toInt() * 100) {
            cnt++
        }
    }

    bw.write("$cnt")

    closeBW()
    close()
}