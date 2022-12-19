import java.io.*
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (n,m) = readLine().split(" ").map{it.toInt()}

    bw.write(n.toString(m).toUpperCase())

    bw.flush()
    bw.close()
    close()
}