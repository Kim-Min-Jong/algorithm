import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}.sorted()
    var cnt = 0
    for(i in 0 until list.size) {
        for(j in i+1 until list.size) {
            if(list[i]+list[j] == m) cnt++
        }
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
    close()
}