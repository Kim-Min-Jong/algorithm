import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    var i = 1
    val list = mutableListOf<Pair<Int,Int>>()
    repeat(8){
        val score = readLine().toInt()
        list.add(Pair(i++, score))
    }
    list.sortByDescending { it.second }
    val result = list.take(5)
    bw.write("${result.sumBy { it.second }}\n")
    result.sortedBy { it.first }.forEach {
        bw.write("${it.first} ")
    }

    bw.flush()
    bw.close()
    close()
}