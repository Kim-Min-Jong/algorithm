import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = mutableListOf<String>()
    while (true) {
        val str = readLine()
        if (str == "000-00-0000") break
        list.add(str)
    }

    list.groupBy { it }.map { it.key to it.value.size }.filter { it.second >= 2 }.map { it.first }
        .sorted().forEach {
            bw.write("$it\n")
        }

    bw.flush()
    bw.close()
    close()
}