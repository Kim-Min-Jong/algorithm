import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){

    val list = readLine().chunked(1).map{it.toInt()}
    var sum = 0
    for(i in list){
        sum += i.toDouble().pow(5.toDouble()).toInt()
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}