import java.io.*
import java.util.*
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (n,m) = readLine().split(" ").map{it.toInt()}
    val set1 = readLine().split(" ").map{it.toInt()}.toSet()
    val set2 = readLine().split(" ").map{it.toInt()}.toSet()
    val sub = set1.subtract(set2)
    if(sub.isNotEmpty()){
        bw.write("${sub.size}\n")
        sub.sorted().forEach{
            bw.write("$it ")
        }
    }else{
        bw.write("0")
    }

    bw.flush()
    bw.close()
    close()
}