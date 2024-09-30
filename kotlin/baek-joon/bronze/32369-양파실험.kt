import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, a, b) = readLine().split(" ").map { it.toInt() }
    var good = 1
    var bad = 1

    repeat(n) {
        if (good < bad) {
            good += b
            bad += a
        } else {
            good += a
            bad += b
        }
        if (good == bad) bad--
    }

    if (good < bad) {
        bw.write("$bad $good")
    } else {
        bw.write("$good $bad")
    }

    bw.flush()
    bw.close()
    close()
}
