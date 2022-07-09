import java.io.*
import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val pi = Math.PI
    val uClid = pi*n*n
    val taxi = 2*n*n.toDouble()
    bw.write("%.6f\n".format(uClid))
    bw.write("%.6f".format(taxi))
    bw.flush()
    bw.close()
    close()
}
