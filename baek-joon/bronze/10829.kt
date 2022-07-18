import java.util.*
import java.io.*
import kotlin.math.round

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toLong()
    bw.write(n.toString(2))

    bw.flush()
    bw.close()
    this.close()
}