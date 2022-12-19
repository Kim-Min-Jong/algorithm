import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
const val INF = 10000000
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = mutableListOf<Int>()
    repeat(n){
        val value = readLine().toInt()
        list.add(value)
    }
    list.sortByDescending { it }
    for(i in 0 until list.size){
        list[i] = list[i] * (i+1)
    }
    bw.write("${list.maxOrNull()!!}")
    
    bw.flush()
    bw.close()
    close()
}