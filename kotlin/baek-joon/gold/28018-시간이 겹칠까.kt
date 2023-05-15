import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sum = IntArray(1000002){0}
    repeat(n) {
        val (a, b) = readLine().split(" ").map{it.toInt()}
        sum[a]++ 
        sum[b+1]--
    }
    for(i in 1 until 1000002) {
        sum[i] += sum[i-1]
    }
    val q = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}
    for(i in 0 until q){
        bw.write("${sum[list[i]]}\n")
    }

    bw.flush()
    bw.close()
    close()
}