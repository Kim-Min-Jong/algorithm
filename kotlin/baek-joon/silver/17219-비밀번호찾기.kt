import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val map = HashMap<String, String>()
    repeat(n){
        val (K, V) = readLine().split(" ")
        map[K] = V
    }
    repeat(m){
        val out = readLine()
        bw.write("${map[out]}\n")
    }

    bw.flush()
    bw.close()
    close()
}