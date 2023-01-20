import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().chunked(1).sortedByDescending { it }
    var sum = 0
    if("0" !in n) {
        bw.write("-1")
    } else {
        for(i in n) {
            sum += i.toInt()
        }
        if(sum % 3 != 0) bw.write("-1")
        else bw.write(n.joinToString(""))
    }
    bw.flush()
    bw.close()
    close()
}