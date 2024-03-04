import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<List<Int>>()
    var result = true
    repeat(m) {
        val k = readLine().toInt()
        list.add(readLine().split(" ").map { it.toInt() })
    }

    for (i in 0 until m) {
        for (j in 1 until list[i].size) {
            if (list[i][j-1] < list[i][j]) {
                result = false
            }
        }
    }

    bw.write(if (result) "Yes" else "No")
    
    bw.flush()
    bw.close()
    close()
}