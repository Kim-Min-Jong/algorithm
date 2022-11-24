import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var str = readLine()
    str = str.replace("XXXX", "AAAA").replace("XX", "BB")
    str.forEach {
        when(it) {
            'X' -> {
                bw.write("-1")
                bw.flush()
                bw.close()
                close()
                return@with
            }
        }
    }
    bw.write(str)
    bw.flush()
    bw.close()
    close()
}