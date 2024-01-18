import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, command) = readLine().split(" ")
    val set = mutableSetOf<String>()
    repeat(n.toInt()) {
        set.add(readLine())
    }
    when(command) {
        "Y" -> {
            bw.write("${set.size}")
        }
        "F" -> {
            bw.write("${set.size / 2}")
        }
        else -> {
            bw.write("${set.size / 3}")
        }
    }

    bw.flush()
    bw.close()
    close()
}