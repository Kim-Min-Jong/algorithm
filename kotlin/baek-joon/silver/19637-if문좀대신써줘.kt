import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Pair<String, Int>>()
    repeat(n) {
        val (name, value) = readLine().split(" ")
        list.add(name to value.toInt())
    }

    repeat(m) {
        val target = readLine().toInt()
        var start = 0
        var end = list.size
        var index = 0

        while (start <= end) {
            val mid = (start + end) / 2

            if (target <= list[mid].second) {
                end = mid - 1
                index = mid
            } else {
                start = mid + 1
            }
        }
        bw.write("${list[index].first}\n")
    }

    bw.flush()
    bw.close()
    close()
}