import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val m = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}
    
    list.sorted().forEach { 
        bw.write("$it ")
    }
    
    bw.flush()
    bw.close()
    close()
}