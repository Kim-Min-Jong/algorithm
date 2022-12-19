import java.util.*
import java.io.*
import kotlin.math.round

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    var arr = IntArray(n){0}
    for(i in 0 until n){
        arr[i] = readLine().toInt()
    }
    arr = arr.sortedArrayDescending()
    for(i in arr){
        bw.write("$i\n")
    }
    
    bw.flush()
    bw.close()
    this.close()
}