import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val sortedList = list.sorted().toMutableList()
    val result = mutableListOf<Int>()

    for (i in list) {
        result.add(sortedList.indexOf(i))
        sortedList[sortedList.indexOf(i)] = Int.MAX_VALUE
    }

    bw.write(result.joinToString(" "))

    bw.flush()
    bw.close()
    close()
}