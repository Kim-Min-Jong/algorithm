import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val l = readLine().toInt()
    val s = readLine().split(" ").map { it.toInt() }
    val n = readLine().toInt()
    var cnt = 0

    if (n in s) {
        bw.write("0")
    } else {
        var min = 0
        var max = 1001

        for (i in s) {
            if (i in (min + 1) until n) min = i
            else if(i in (n + 1) until max) max = i
        }

        for (i in min + 1 .. n) {
            for (j in n until max) {
                if (i != j)
                    cnt++
            }
        }
        bw.write("$cnt")
    }

    bw.flush()
    bw.close()
    close()
}