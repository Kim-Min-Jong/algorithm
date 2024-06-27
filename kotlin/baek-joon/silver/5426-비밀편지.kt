import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val str = readLine()
        val sb = StringBuilder()
        val length = sqrt(str.length.toDouble()).toInt()

        for (i in length - 1 downTo 0) {
            for (j in str.indices step length) {
                sb.append(str.substring(j until j + length)[i])
            }
        }
        bw.write(sb.toString() + "\n")
    }

    bw.flush()
    bw.close()
    close()
}