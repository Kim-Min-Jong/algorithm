import java.io.*
import java.util.*
import kotlin.math.abs
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val list = mutableListOf<List<Int>>()
    repeat(9){
        val input1 = readLine().split(" ").map{it.toInt()}
        list.add(input1)
    }
    val max = list.flatten().maxOrNull()!!
    var row = 0
    var col = 0
    bw.write("$max\n")
    for(i in 0 until 9){
        for(j in 0 until 9){
            if(list[i][j] == max){
                row = i + 1
                col = j + 1
            }
        }
    }
    bw.write("$row $col")

    bw.flush()
    bw.close()
    close()
}