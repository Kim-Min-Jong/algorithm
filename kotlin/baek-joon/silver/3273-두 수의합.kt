import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}.sorted()
    val x = readLine().toInt()
    var left = 0
    var right = n - 1
    var cnt = 0

   while(left < right) {
       val tmp = list[left] + list[right]
       if(tmp == x)
           cnt++
       if(tmp < x) {
           left++
           continue
       }
       right--
   }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
} 