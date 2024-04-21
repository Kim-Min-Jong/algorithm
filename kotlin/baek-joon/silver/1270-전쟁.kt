import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val list = readLine().trim().split(" ").map { it.toLong() }
        val newList = list.subList(1, list.size).groupBy { it }.map { it.key to it.value.size }

        val maxValue = newList.maxBy { it.second }
        if (list[0] / 2 < maxValue.second) {
            bw.write("${maxValue.first}\n")
        } else {
            bw.write("SYJKGW\n")
        }

    }

    bw.flush()
    bw.close()
    close()
}