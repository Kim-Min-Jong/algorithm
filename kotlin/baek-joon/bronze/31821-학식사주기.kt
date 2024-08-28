import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()

    repeat(n) {
        list.add(readLine().toInt())
    }

    val m = readLine().toInt()
    var sum = 0
    repeat(m) {
        val index = readLine().toInt() - 1
        sum += list[index]
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}