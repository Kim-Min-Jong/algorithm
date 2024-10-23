import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    var num = 0
    var tmpA = 1
    for (a in 0 until n - 3) {
        tmpA *= list[a]
        var tmpB = 1
        for (b in a + 1 until n - 2) {
            tmpB *= list[b]
            var tmpC = 1
            for (c in b + 1 until n - 1) {
                tmpC *= list[c]
                var tmpD = 1
                for (d in c + 1 until n) {
                    tmpD *= list[d]
                }
                num = max(tmpA + tmpB + tmpC + tmpD , num)
            }
        }
    }

    bw.write("$num")

    bw.flush()
    bw.close()
    close()
}