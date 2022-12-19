import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val n = readLine().toInt()
    bw.write("${(n*(n-1)*(n-2)*(n-3)) / 24}")

    bw.flush()
    bw.close()
    close()
}