import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var cnt = 0

    var i = 1
    while (i < 1_000_000_000) {
        for (k in 1..9) {
            if (i * k <= n) cnt++
        }
        i = i * 10 + 1
    }

    bw.write("${cnt + 1}")

    closeBW()
    close()
}
