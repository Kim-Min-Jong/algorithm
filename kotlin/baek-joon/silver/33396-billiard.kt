import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        val (n, m) = readLine().split(" ").map { it.toInt() }.sorted()
        bw.write("${check(n, m)}\n")
    }

    closeBW()
    close()
}
fun check(n: Int, m: Int): Int {
    var x = 0
    var y = 0
    var dx = 1
    var dy = 1
    var t = 0
    while (true) {
        if (x + dx < 0) dx *= -1
        if (x + dx > n) dx *= -1
        if (y + dy < 0) dy *= -1
        if (y + dy > m) dy *= -1
        x += dx
        y += dy
        ++t
        if (x == 0 && y == 0) break
    }
    return t
}
