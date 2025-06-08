import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()

    repeat(n) {
        val n = readLine()

        if (isSquare(n.toLong()) && isSquare(n.reversed().toLong())) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }

    }

    closeBW()
    close()
}

fun isSquare(i: Long): Boolean {
    val sqrt = sqrt(i.toDouble()).toLong()
    return sqrt * sqrt == i
}