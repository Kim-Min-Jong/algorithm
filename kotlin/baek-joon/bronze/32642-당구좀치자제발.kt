import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    var sum = 0L
    var anger = 0L

    list.forEach {
        if (it == 1) {
            anger++
        } else {
            anger--
        }
        sum += anger
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}