import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var (n, jimin, hansu) = readLine().split(" ").map{it.toInt()}
    var cnt = 0
    var isFighting = false

    while(jimin != hansu) {
        jimin = (jimin + 1) / 2
        hansu = (hansu + 1) / 2
        cnt++
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}