import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = readLine().split(" ").map { it.toInt() }.sorted()
    val n = readLine().toInt()
    var cnt = 0
    val chkSet = mutableSetOf<Pair<Int, Int>>()
    for (i in 0 until list.size) {
        for (j in i + 1 until list.size) {
            if (list[i] + list[j] == n) {
                if (chkSet.contains(list[i] to list[j])) continue
                cnt++
                chkSet.add(list[i] to list[j])
                bw.write("${list[i]} ${list[j]}\n")
            }
        }
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}