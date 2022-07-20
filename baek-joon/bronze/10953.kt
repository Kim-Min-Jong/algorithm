import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    repeat(n){
        val m = readLine().split(",").map{it.toInt()}
        bw.write("${m.sum()}\n")
    }
    bw.flush()
    bw.close()
    this.close()
}