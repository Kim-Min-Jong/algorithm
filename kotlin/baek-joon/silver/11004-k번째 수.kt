import java.util.*
import java.io.*
import kotlin.math.round

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val (n,k) = readLine().split(" ").map{it.toInt()}
    val list = readLine().split(" ").map{it.toInt()}.sorted()
    bw.write("${list[k-1]}")
    bw.flush()
    bw.close()
    this.close()
}