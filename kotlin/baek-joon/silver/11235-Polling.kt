import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<String>()

    repeat(n) {
        list.add(readLine())
    }

    val sorted = list.groupBy { it }.map { it.key to it.value.size }
    val max = sorted.maxOf { it.second }
    val new = sorted.filter { it.second == max }
    new.sortedBy { it.first }.forEach {
        bw.write(it.first + "\n")
    }
    
    bw.flush()
    bw.close()
    close()
}