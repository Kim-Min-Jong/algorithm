import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    var length = 0

    for (i in str.indices) {
        when {
            i == 0 -> length += 10
            str[i] == str[i - 1] -> length += 5
            else -> length += 10
        }
    }

    bw.write("$length")

    bw.flush()
    bw.close()
    close()
}