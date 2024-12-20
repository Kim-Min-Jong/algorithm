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
        val list = readLine().split(" ").map { it.toInt() }.sorted().subList(1, 4)
        val min = list.first()
        val max = list.last()

        if (max - min >= 4) {
            bw.write("KIN\n")
        } else {
            bw.write("${list.sum()}\n")
        }
    }

    closeBW()
    close()
}