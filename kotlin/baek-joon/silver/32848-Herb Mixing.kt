import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}
fun main() = with(System.`in`.bufferedReader()) {
    val (green, red) = readLine().split(" ").map { it.toInt() }
    var sum = 0
    if (green == 0) {
        bw.write("0")
        closeBW()
        close()
        return@with
    } else {
        if (green > red) {
            sum += red * 10
        } else {
            sum += green * 10
        }
        var remainGreen = green - red
        val list = listOf(3, 2, 1)
        val value = listOf(10, 3, 1)
        for (i in 0 until 3) {
            if (remainGreen <= 0) break
            val cnt = remainGreen / list[i]
            sum += value[i] * cnt
            remainGreen -= list[i] * cnt
        }
    }
    bw.write("$sum")

    closeBW()
    close()
}