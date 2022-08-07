import java.io.*
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toLong()
    var sum = 0L
    var cnt = 0
    var i = 1
    while(true){
        if(sum > n) break
        sum += i
        cnt++
        i++
    }

    bw.write("${cnt-1}")

    bw.flush()
    bw.close()
    close()
}