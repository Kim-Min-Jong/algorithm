import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine()
    var cnt = 0
    while(true) {
        val tmp = (n.toInt() * 2).toString()
        if (n.length != tmp.length) {
            break
        }
        n = tmp
        cnt++
    }

    bw.write("$cnt")

    closeBW()
    close()
}