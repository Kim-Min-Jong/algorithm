import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sum = readLine().split(" ").map { it.toInt() }.sum() * 2

    bw.write("${(180 * (n - 1)) - sum}")

    bw.flush()
    bw.close()
    close()
}