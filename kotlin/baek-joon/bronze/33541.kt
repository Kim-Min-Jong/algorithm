import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()

    var answer = n.toInt() + 1

    while(answer <= 9999) {
        val split = answer.toString().chunked(2).map { it.toInt() }
        val v = split.first() + split.last()
        val x = v * v
        if (x == answer) {
            break
        } else {
            answer++
        }
    }

    bw.write("${if(answer >= 9999) -1 else answer}")

    closeBW()
    close()
}