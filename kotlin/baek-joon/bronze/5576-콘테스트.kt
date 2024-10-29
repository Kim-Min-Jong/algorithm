import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val wList = mutableListOf<Int>()
    val kList = mutableListOf<Int>()
    repeat(10) {
        wList.add(readLine().toInt())
    }
    repeat(10) {
        kList.add(readLine().toInt())
    }

    bw.write("${wList.sorted().takeLast(3).sum()} ${kList.sorted().takeLast(3).sum()}")

    bw.flush()
    bw.close()
    close()
}