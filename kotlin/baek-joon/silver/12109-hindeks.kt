import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.sortedDescending()
    var result = 0
    for (i in list.indices) {
        if(list[i] < i + 1) break
        else result = i + 1
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    close()
}