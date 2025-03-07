import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}
fun main() = with(System.`in`.bufferedReader()) {
    val list = readLine().split(" ").map { it.toInt() }.sortedDescending()
    
    bw.write("${list.take(2).sum()}")
    

    closeBW()
    close()
}