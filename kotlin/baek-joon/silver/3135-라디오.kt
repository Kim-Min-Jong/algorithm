import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.abs
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(" ").map{it.toInt()}
    val n = readLine().toInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(readLine().toInt())
    }

    if(b in list) {
        bw.write("1")
        bw.flush()
        bw.close()
        close()
        return
    } else {
        val minN = abs(a - b)
        val tmp = list.map { it - b }.minOf { abs(it) }
        if(tmp < minN) {
            bw.write("${tmp+1}")
        } else {
            bw.write("$minN")
        }
    }


    bw.flush()
    bw.close()
    close()
}