import java.io.BufferedWriter
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toLong() }
    var total = list.sum()
    var res = 0L

    list.forEach {
        val tmp = it
        total -= it
        res += total * it
    }

    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}