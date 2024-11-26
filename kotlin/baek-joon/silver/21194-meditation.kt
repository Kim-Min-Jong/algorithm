import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()

    repeat(n) {
        list.add(readLine().toInt())
    }

    bw.write("${list.sortedDescending().take(k).sum()}")

    closeBW()
    close()
}