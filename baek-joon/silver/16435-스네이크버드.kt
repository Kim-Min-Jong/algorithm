import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    var (n, len) = readLine().split(" ").map{it.toInt()}
    val list = readLine().split(" ").map{it.toInt()}.sorted()

    for(i in list){
        if(len >= i){
            len++
        }else break
    }
    bw.write("$len")

    bw.flush()
    bw.close()
    close()
}