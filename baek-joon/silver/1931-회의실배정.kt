import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int,Int>>()
    var cnt = 0
    var tmp = -1
    repeat(n){
        val (a, b) = readLine().split(" ").map{it.toInt()}
        list.add(Pair(a,b))
    }
    list.sortWith(compareBy({it.second}, {it.first}))

    for(i in 0 until n){
        if(tmp <= list[i].first){
            cnt++
            tmp = list[i].second
        }
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}