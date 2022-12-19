import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val arr = mutableListOf<List<Int>>()
    var length = min(n, m)
    repeat(n) {
        arr.add(readLine().chunked(1).map{it.toInt()})
    }

    loop@while(length > 1) {
        for(i in 0..n-length) {
            for(j in 0..m-length){
                val tmp = arr[i][j]
                if(tmp == arr[i-1+length][j-1+length] && tmp == arr[i][j-1+length] && tmp == arr[i-1+length][j]) {
                    bw.write("${length*length}")
                    break@loop 
                }
            }
        }
        length--;
    }
    if(length == 1)
        bw.write("1")

    bw.flush()
    bw.close()
    close()
}