import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    var res = 0
    var tmp = 0
    for (score in list) {
        if (score == 1) {
            tmp += 1
            res += tmp
        }
        else
            tmp = 0   
    }
 
    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}