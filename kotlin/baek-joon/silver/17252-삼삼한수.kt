import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt().toString(3)

    when {
        n == "0" || n == "2" -> bw.write("NO")
        n.all { it == '1' || it == '0' } -> bw.write("YES")
        else -> bw.write("NO")
    }
    bw.flush()
    bw.close()
    close()
}