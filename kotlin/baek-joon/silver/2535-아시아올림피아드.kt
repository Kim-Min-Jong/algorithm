import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<List<Int>>()
    repeat(n) {
        list.add(readLine().split(" ").map { it.toInt() })
    }
    list.sortByDescending { it[2] }
    
    bw.write("${list[0][0]} ${list[0][1]}\n")
    bw.write("${list[1][0]} ${list[1][1]}\n")

    var lastIndex = 2

    for (i in 2 until n) {
        if (list[0][0] == list[1][0]) {
            if (list[0][0] != list[i][0]) {
               lastIndex = i
                break
            }
        }
    }
    bw.write("${list[lastIndex][0]} ${list[lastIndex][1]}")

    bw.flush()
    bw.close()
    close()
}