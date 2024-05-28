import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        repeat(b) {
            val (x, y) = readLine().split(" ").map { it.toInt() - 1 }
        }
        bw.write("${a - 1}\n")
    }

    bw.flush()
    bw.close()
    close()
}