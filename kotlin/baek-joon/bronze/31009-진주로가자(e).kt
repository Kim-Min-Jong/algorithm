import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = mutableListOf<Pair<String, Int>>()
    repeat(n) {
        val (destination, cost) = readLine().split(" ")
        list.add(destination to cost.toInt())
    }
    
    val res = list.find { it.first == "jinju" }
    
    bw.write("${res?.second}\n")
    bw.write("${list.count { it.second > res?.second!! }}")
    
    bw.flush()
    bw.close()
    close()
}