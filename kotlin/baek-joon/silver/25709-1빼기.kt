import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var cnt = 0
    var str = n.toString()
    while(n != 0) {
        str = n.toString()
        if(str.contains('1')) {
            val idx = str.indexOf('1')
            str = str.substring(0, idx) + str.substring(idx + 1)
            try{
                n = str.toInt()
            } catch (e: Exception) {
                cnt += 1
                break
            }
        } else {
            n--
        }
        cnt++
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}