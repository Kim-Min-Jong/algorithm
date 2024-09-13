import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val firstAlphabet = readLine().split("-").map { it.first().toString() }

    bw.write("${firstAlphabet.joinToString("")}")

    bw.flush()
    bw.close()
    close()
}