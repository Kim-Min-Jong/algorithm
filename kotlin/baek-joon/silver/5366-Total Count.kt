import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = mutableListOf<String>()
    while(true) {
        val str = readLine()
        if(str == "0") break
        list.add(str)
    }
    list.groupBy { it }.map { it.key to it.value.size }.toList().forEach {
        bw.write("${it.first}: ${it.second}\n")
    }
    bw.write("Grand Total: ${list.size}")

    bw.flush()
    bw.close()
    close()
}