import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()
    val separator = ", "
    repeat(tc) {
        val n = readLine().toInt()
        val list = mutableListOf<Pair<String, Int>>()
        repeat(n) {
            val (name, cnt) = readLine().split(" ")
            list.add(name to cnt.toInt())
        }
        val result = list.sortedByDescending { it.second }.joinToString(separator) { it.first }.removeSuffix("separator")
        bw.write("$result\n")
    }

    bw.flush()
    bw.close()
    close()
}