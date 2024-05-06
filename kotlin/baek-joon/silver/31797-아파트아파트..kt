import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.collections.ArrayDeque

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{ it.toInt() }
    val dq = ArrayDeque<Pair<Int, Int>>()

    (1..m).forEach {
        val (h1, h2) = readLine().split(" ").map{ it.toInt() }
        dq.add(it to h1)
        dq.add(it to h2)
    }

    dq.sortBy { it.second }

    repeat(n) {
        dq.addLast(dq.removeFirst())
    }

    bw.write("${dq.last().first}")

    bw.flush()
    bw.close()
    close()
}