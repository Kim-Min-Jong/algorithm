import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (n, m) = readLine().split(" ")
    val revX = n.reversed().toInt()
    val revY = m.reversed().toInt()
    
    bw.write("${(revX + revY).toString().reversed().toInt()}")

    bw.flush()
    bw.close()
    close()
}