import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (b, n, m) = readLine().split(" ").map { it.toLong() }
    val map = hashMapOf<String, Long>()
    var sum = 0L
    repeat(n.toInt()) {
        val (name, price) = readLine().split(" ")
        map[name] = price.toLong()
    }

    repeat(m.toInt()) {
        sum += map[readLine()]!!
    }

    bw.write(if (sum <= b) "acceptable" else "unacceptable")

    closeBW()
    close()
}