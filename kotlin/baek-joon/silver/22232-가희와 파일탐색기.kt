import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Pair<String, String>>()
    val extensions = hashSetOf<String>()
    repeat(n) {
        val (name, extension) = readLine().split(".")
        list.add(name to extension)
    }
    repeat(m) {
        extensions.add(readLine())
    }

    list.sortedWith(compareBy<Pair<String, String>> { it.first }
        .thenBy { extensions.contains(it.second).not() }
        .thenBy { it.second }
    ).forEach {
            bw.write("${it.first}.${it.second}\n")
    }

    bw.flush()
    bw.close()
    close()
}