import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    var pivot = list.first().toLong()
    val other = list.subList(1, list.size ).sorted()
    var survive = true

    for (i in other) {
        if (i < pivot) {
            pivot += i
        } else {
            survive = false
            break
        }
    }

    bw.write(if (survive) "Yes" else "No")

    bw.flush()
    bw.close()
    close()
}