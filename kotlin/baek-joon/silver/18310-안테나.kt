import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}

    bw.write("${list.sorted()[(n-1)/2]}")

    bw.flush()
    bw.close()
    close()
}