import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    var index = 1
    while(true) {
        val n = readLine().toInt()
        if (n == 0) break
        val list = mutableListOf<String>()
        repeat(n) {
            val animal = readLine().split(" ").map { it.lowercase() }.last()
            list.add(animal)
        }

        val map = list.groupBy { it }.map { it.key to it.value.size }.sortedBy { it.first }
        bw.write("List $index:\n")
        map.forEach{
            bw.write("${it.first} | ${it.second}\n")
        }
        index++
    }

    bw.flush()
    bw.close()
    close()
}