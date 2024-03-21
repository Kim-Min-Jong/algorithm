import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        val (s, p) = readLine().split(" ")
        val tmp = s.replace(p, "")
        val size = s.length - tmp.length
        val replaceTime = size / p.length

        bw.write("${replaceTime + tmp.length}\n")
    }

    bw.flush()
    bw.close()
    close()
}