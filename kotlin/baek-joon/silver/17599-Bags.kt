import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val res = readLine().split(" ").map { it.toInt() }.groupBy { it }.size
    
    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}