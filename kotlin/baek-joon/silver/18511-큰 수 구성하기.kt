import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

val bw = BufferedWriter(OutputStreamWriter(System.out))
var answer = 0
fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }

    recursive_18511(0, n, list, k)

    bw.write("$answer")

    bw.flush()
    bw.close()
    close()
}
fun recursive_18511 (num: Int, n: Int, list: List<Int>, k: Int) {
    if (num > n) return

    answer = max(answer, num)

    val digit = num * 10

    for (i in 0 until k) {
        recursive_18511(list[i] + digit, n, list, k)
    }
}
