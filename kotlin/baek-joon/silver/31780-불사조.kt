import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (x, m) = readLine().split(" ").map{ it.toInt() }
    
    bw.write("${x * (m + 1)}")

    bw.flush()
    bw.close()
    close()
}