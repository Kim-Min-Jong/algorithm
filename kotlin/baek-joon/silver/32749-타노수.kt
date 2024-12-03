import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}
fun pow2(n: Int): Int {
    var res = 1
    for (i in 0 until n) {
        res *= 2
    }
    return res
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, t) = readLine().split(" ").map { it.toInt() }
    val str = readLine()
    val len = str.length
    val piece = len / pow2(2)

    val chunkedList = str.chunked(piece).map { it.toInt() }

    bw.write("${chunkedList.max()}")

    closeBW()
    close()
} // ..다시