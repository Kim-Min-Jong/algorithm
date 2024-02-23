import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (a, b, c) = readLine().split(" ").map {it.toInt()} 
    val total = a * b - c
    when {
        total <= 0 -> bw.write("0")
        else -> bw.write("$total")
    }

    bw.flush()
    bw.close()
    close()
} 