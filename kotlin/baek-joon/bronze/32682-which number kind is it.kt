import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        var o = false
        var s = false

        val k = readLine().toLong()

        if (k % 2L == 1L) {
            o = true
        }

        val sqrt = sqrt(k.toDouble()).toLong()
        if (sqrt * sqrt == k) {
            s = true
        }

        when {
            o && s -> bw.write("OS\n")
            !o && s -> bw.write("S\n")
            o && !s -> bw.write("O\n")
            !o && !s -> bw.write("EMPTY\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}