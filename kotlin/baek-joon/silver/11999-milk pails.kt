import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (x, y, m) = readLine().split(" ").map { it.toInt() }
    var answer = Int.MIN_VALUE

    for (i in 0..1000) {
        for (j in 0..1000) {
            val threshHold = i * x + j * y

            if (m >= threshHold) {
                answer = max(answer, threshHold)
            }
        }
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
    close()
}