import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val m = readLine().toInt()
    val str = readLine()
    val pivot = StringBuilder("I")
    var cnt = 0
    for(i in 1..n){
        pivot.append("OI")
    }
    for(i in 0 until str.length-pivot.length){
        var sl = str.slice(i until pivot.length+i)
        if(sl == pivot.toString()) cnt++
    }
    bw.write("$cnt")


    bw.flush()
    bw.close()
    this.close()
}