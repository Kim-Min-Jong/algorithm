import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    repeat(n){
        val list = readLine().split(" ")
        for(i in list){
            bw.write("${i.reversed()} ")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    this.close()
}