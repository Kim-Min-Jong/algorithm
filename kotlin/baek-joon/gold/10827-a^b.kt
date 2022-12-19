import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    var (n,m) = readLine().split(" ")
    val d = n.toBigDecimal()

    bw.write(d.pow(m.toInt()).toPlainString())

    bw.flush()
    bw.close()
    close()
}