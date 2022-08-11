import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n= readLine().toInt()
    var cute = 0
    var notCute = 0
    repeat(n){
        val m = readLine().toInt()
        if(m == 1) cute++
        else notCute++
    }
    if(cute > notCute) bw.write("Junhee is cute!")
    else bw.write("Junhee is not cute!")

    bw.flush()
    bw.close()
    this.close()
}