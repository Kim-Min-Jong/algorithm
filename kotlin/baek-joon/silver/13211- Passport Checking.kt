import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stolenPassports = hashSetOf<String>()
    var cnt = 0
    repeat(n) {
        stolenPassports.add(readLine())
    }
    val m = readLine().toInt()
    repeat(m) {
        if (stolenPassports.contains(readLine())) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
    close()
}