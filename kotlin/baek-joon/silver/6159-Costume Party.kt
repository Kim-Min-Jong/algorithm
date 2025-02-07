import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, s) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    var res = 0
    repeat(n) {
        list.add(readLine().toInt())
    }

    list.sort()

    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            if (list[i] + list[j] <= s) {
                res++
            } else {
                break
            }
        }
    }

    bw.write("$res")

    closeBW()
    close()
}