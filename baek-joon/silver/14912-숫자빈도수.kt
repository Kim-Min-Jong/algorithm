import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val (n,m) = readLine().split(" ").map{it.toInt()}
    val list = mutableListOf<Int>()
    var sum = 0
    for(i in 1..n){
        list.add(i)
    }
    for(i in list){
        sum += i.toString().chunked(1).filter{it == m.toString()}.count()
    }
    bw.write("$sum")
    bw.flush()
    bw.close()
    this.close()
}