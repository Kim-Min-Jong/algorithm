import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = mutableMapOf<String, Int>()
    var cnt = 0

    readLine().split(" ").mapIndexed { index, s ->
        map[s] = index
    }

    val input = readLine().split(" ")

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (map[input[j]]!! > map[input[i]]!!) cnt++
        }
    }

    bw.write("$cnt/${(n * (n - 1)) / 2}")

    bw.flush()
    bw.close()
    close()
}
