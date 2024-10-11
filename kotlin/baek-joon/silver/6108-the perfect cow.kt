import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val medians = mutableListOf<Int>()

    repeat(n) {
        val list = readLine().split(" ").map { it.toInt() }.sorted()
        medians.add(list[n / 2])
    }

    bw.write("${medians.sorted()[n / 2]}")

    bw.flush()
    bw.close()
    close()
}