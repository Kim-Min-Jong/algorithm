import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashMap
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        bw.write("${readLine().replace("PO", "PHO")}\n")
    }

    closeBW()
    close()
}