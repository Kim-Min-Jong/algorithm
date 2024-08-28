import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val code = readLine().substring(0..4)
    val n = readLine().toInt()
    var cnt = 0

    repeat(n) {
        val enableCode = readLine().substring(0..4)
        cnt += if (enableCode == code) 1 else 0
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}
