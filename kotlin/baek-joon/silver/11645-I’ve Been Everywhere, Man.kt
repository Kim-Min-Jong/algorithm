import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()

    repeat(tc) {
        val n = readLine().toInt()
        val set = mutableSetOf<String>()
        repeat(n) {
            val str = readLine()
            set.add(str)
        }
        bw.write("${set.size}\n")
    }
    bw.flush()
    bw.close()
    close()
}