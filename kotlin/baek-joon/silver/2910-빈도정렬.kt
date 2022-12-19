import java.io.*
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){

    var n = readLine().split(" ").map{it.toInt()}
    val list = readLine().split(" ").map{it.toInt()}
    val map = list.groupBy { it }.map{it.key to it.value.size}.sortedByDescending { it.second }
    for(i in map){
        repeat(i.second){
            bw.write("${i.first} ")
        }
    }

    bw.flush()
    bw.close()
    close()
}