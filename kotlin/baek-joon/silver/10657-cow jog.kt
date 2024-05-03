import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()
    var min = Int.MAX_VALUE
    var cnt = 0

    repeat(n) {
        val (position, speed) = readLine().split(" ").map { it.toInt() }
        list.add(speed)
    }
    list.reverse()

    for (i in 0 until n) {
        if (min >= list[i]) {
            min = list[i]
            cnt++
        }
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}