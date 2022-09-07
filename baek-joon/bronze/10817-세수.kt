import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().split(" ").map{it.toInt()}.sorted()

    bw.write("${n[1]}")
    bw.flush()
    bw.close()
    this.close()
}