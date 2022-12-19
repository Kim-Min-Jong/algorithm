import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<String>()
    repeat(n) {
        list.add(readLine())
    }
    val sorted = list.sorted()
    val reversed = list.sortedDescending()

    when (list) {
        reversed ->
            bw.write("DECREASING")
        sorted ->
            bw.write("INCREASING")
        else -> bw.write("NEITHER")
    }
    
    bw.flush()
    bw.close()
    close()
}