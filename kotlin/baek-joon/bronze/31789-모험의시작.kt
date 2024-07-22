import java.io.BufferedWriter
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (x, s) = readLine().split(" ").map { it.toInt() }
    var isPossible = false
    for (i in 0 until n) {
        val (c, p) = readLine().split(" ").map { it.toInt() }
        isPossible = x >= c && s < p
        if (isPossible) break
    }

    bw.write(if (isPossible) "YES" else "NO")


    bw.flush()
    bw.close()
    close()
}