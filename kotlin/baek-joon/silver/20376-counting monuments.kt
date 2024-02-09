import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val set = mutableSetOf<String>()
    while (true) {
        val str = readLine() ?: break
        if (str == "") break
        val split = str.split(" ").slice(1 until str.split(" ").size)
        set.add(split.joinToString(" "))

    }
    bw.write("${set.size}")
    bw.flush()
    bw.close()
    close()
}
