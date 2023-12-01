import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{ it.toInt() }
    val arr = MutableList(n) { i -> i + 1}
    repeat(m) {
        val (from, to) = readLine().split(" ").map{ it.toInt() - 1 }
        Collections.swap(arr, from, to)
    }

    arr.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()

}
