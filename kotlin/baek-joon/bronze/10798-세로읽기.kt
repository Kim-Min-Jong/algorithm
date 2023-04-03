import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = mutableListOf<List<String>>()
    repeat(5) {
        val st = readLine().chunked(1)
        list.add(st)
    }
    var max = 0
    for(l in list) {
        max = Math.max(max, l.size)
    }
    for(j in 0 until max) {
        for(i in 0 until 5) {
            try {
                bw.write("${list[i][j]}")
            } catch(e: Exception) {
                continue
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}