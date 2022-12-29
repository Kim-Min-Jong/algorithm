import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toLong()
    val (a, b, c, d) = readLine().split(" ").map{it.toLong()}
    val leftLimit = a * k + b
    val rightLimit = c * k + d
    when (leftLimit) {
        rightLimit -> {
            bw.write("Yes $rightLimit")
        }
        else -> {
            bw.write("No")
        }
    }


    bw.flush()
    bw.close()
    close()
}