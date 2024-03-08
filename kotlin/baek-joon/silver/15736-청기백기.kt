import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = 1

    for (i in 2 ..n) {
        if (i * i > n) break
        result++
    }
    
    bw.write("$result")

    bw.flush()
    bw.close()
    close()
}