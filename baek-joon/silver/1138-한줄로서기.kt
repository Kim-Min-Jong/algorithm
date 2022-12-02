import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}
    val answer = mutableListOf<Int>()

    for(i in n-1 downTo 0) {
        answer.add(list[i], i + 1)
    }
    answer.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()
}