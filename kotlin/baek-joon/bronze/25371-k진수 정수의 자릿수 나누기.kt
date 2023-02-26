import java.io.*
import java.util.*
import kotlin.math.abs
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){

    val (n,k) = readLine().split(" ").map{it.toInt()}

    val jinsu = n.toString(k)
    if(jinsu.contains('0')){
        val a = jinsu.split("0").filter{it != ""}.map{it.toLong()}
        val result = a.sum().toString(k)
        bw.write(result)
    } else{
        var result = jinsu.toLong().toString(k)
        bw.write(result)
    }

    bw.flush() 
    bw.close()
    close()
}