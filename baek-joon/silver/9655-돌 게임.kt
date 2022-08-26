import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    var n = readLine().toInt()
    when{
        n % 2 == 1 -> bw.write("SK")
        else -> bw.write("CY")
    }

    bw.flush()
    bw.close()
    close()
}