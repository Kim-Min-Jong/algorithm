import java.io.BufferedWriter
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val str = readLine()
        if (str == "P=NP") bw.write("skipped\n")
        else {
            val (a, b) = str.split("+").map { it.toInt() }
            bw.write("${a + b}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}