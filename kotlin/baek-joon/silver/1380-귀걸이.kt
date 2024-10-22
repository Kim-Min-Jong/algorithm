import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var senario = 1
    while(true) {
        val tc = readLine().toInt()
        if (tc == 0) break

        val list = mutableListOf<String>()
        val numList = mutableListOf<Int>()
        repeat(tc) {
            list.add(readLine())
        }

        repeat(2 * tc - 1) {
            val (num, str) = readLine().split(" ")
            numList.add(num.toInt())
        }

        val not = numList.groupBy { it }.map { it.key to it.value.size }.find { it.second == 1 }!!

        bw.write("$senario ${list[not.first - 1]}\n")

        senario++
    }

    bw.flush()
    bw.close()
    close()
}