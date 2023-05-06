import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<String>()

    repeat(n) { 
        list.add(readLine())
    }
    bw.write(list.groupBy{ it }.map{it.key to it.value.size}.sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first }).first().first)

    bw.flush()
    bw.close()
    close()
}