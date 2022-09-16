9237import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}.sorted().reversed()
    var max = 0
    for(i in 0 until n){
        max = max(max, list[i] + i + 1)
    }
    bw.write("${max + 1}")


    bw.flush()
    bw.close()
    close()
}