import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val list = readLine().split(" ").map { it.toInt() }.toMutableList()
        var change = 0
        for (i in 1 until list.size) {
            for (j in i + 1 until list.size) {
                if(list[i] > list[j]) {
                    val tmp = list[i]
                    list[i] = list[j]
                    list[j] = tmp
                    change++
                }
            }
        }
        bw.write("${list[0]} $change\n")
    }

    bw.flush()
    bw.close()
    close()
}