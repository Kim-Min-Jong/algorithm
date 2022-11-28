import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val n = readLine().toInt()
        if(n == 0) break
        val list = mutableListOf<Pair<String, Double>>()
        repeat(n) {
            val (name, height) = readLine().split(" ")
            list.add(Pair(name, height.toDouble()))
        }
        list.sortByDescending { it.second }
        val maxHeight = list.first().second
        list.forEach {
            if(it.second == maxHeight) {
                bw.write("${it.first} ")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    close()
}