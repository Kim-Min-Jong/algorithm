import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, pivot) = readLine().split(" ")
    var result = 0
    repeat(n.toInt()) {
        val (name, cnt) = readLine().split(" ")
        if (name.split("_").contains(pivot)) {
            result += cnt.toInt()
        }
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    close()
}