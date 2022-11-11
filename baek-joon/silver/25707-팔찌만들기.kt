import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}.sorted()
    
    bw.write("${2*(list.last()-list.first())}")
    
    bw.flush()
    bw.close()
    close()
}