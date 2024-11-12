import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val minList = mutableListOf<Int>()
    val maxList = mutableListOf<Int>()

    repeat(n) {
        val (start, end) = readLine().split(" ").map { it.toInt() }
        minList.add(start)
        maxList.add(end)
    }

    val min = minList.max()
    val max = maxList.min()

    if (min > max) {
        bw.write("bad news")
    } else {
        bw.write("${max - min + 1} $min")
    }

    bw.flush()
    bw.close()
    close()
}