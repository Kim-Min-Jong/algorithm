import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    var cnt = -1
    val list = mutableListOf<Int>()
    repeat(n){
        list.add(readLine().toInt())
        cnt++
    }
    bw.write("${list.sum()-cnt}")

    bw.flush()
    bw.close()
    this.close()
}