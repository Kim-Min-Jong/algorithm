import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }
    var left = 0
    var right = 1
    var result = 0

    while (right in left..n) {
        val sum = list.subList(left, right).sum()

        if (sum == m) {
            result++
            right++
        } else if (sum > m) {
            left++
        } else {
            right++
        }
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    close()
}