import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val k = readLine().toInt()
        val res = Math.sqrt(k.toDouble()).toString().split(".")

        bw.write(if (res.last().length == 1 && res.last().first() == '0') "1\n" else "0\n")
    }

    closeBW()
    close()
}