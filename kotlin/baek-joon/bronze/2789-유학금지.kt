import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    var str = readLine()
    val cambridge = "CAMBRIDGE".toCharArray()

    for (i in cambridge) {
        if (i in str) {
           str = str.replace(i.toString(), "")
        }
    }

    bw.write("$str")

    bw.flush()
    bw.close()
    close()
}
