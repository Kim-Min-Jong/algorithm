import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<String>()

    repeat(n) {
        list.add(readLine())
    }

    val result = list.groupBy { it }.map { it.key to it.value.size }
    val max = result.maxOf { it.second }
    result.filter { it.second == max }.sortedByDescending { it.first }.run {
        bw.write("${first().first} ${first().second}")
    }

    bw.flush()
    bw.close()
    close()
}