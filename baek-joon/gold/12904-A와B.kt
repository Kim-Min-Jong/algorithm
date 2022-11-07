import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str1 = readLine()
    var str2 = readLine()

    while(true) {
        if(str2==str1) {
            bw.write("1")
            bw.flush()
            bw.close()
            close()
            return@with
        }
        if(str2.length < str1.length) break

        if(str2[str2.lastIndex]=='A') {
            str2 = str2.substring(0 until str2.lastIndex)
        } else if(str2[str2.lastIndex]=='B') {
            str2 = str2.substring(0 until str2.lastIndex).reversed()
        }
    }
    bw.write("0")

    bw.flush()
    bw.close()
    close()
}
