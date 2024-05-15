import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var f = readLine().toInt()

    n -= n % 100

    while (true) {
        if (n % f == 0) break
        n++
    }

    val res = (n % 100).toString()

    bw.write(if (res.length == 1) "0$res" else res)

    bw.flush()
    bw.close()
    close()
}