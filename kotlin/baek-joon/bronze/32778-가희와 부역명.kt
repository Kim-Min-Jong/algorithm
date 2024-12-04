import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val list = readLine().split("(")
    bw.write(list.first() + "\n")
    if (list.size == 1) {
        bw.write("-")
    } else {
        bw.write(list.last().removeSuffix(")"))
    }

    closeBW()
    close()
}
