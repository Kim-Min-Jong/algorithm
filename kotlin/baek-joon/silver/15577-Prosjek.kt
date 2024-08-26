import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Double>()

    repeat(n) {
        list.add(readLine().toDouble())
    }

    list.sort()

    var answer = 0.0
    for (i in 1 until n) {
        if (i == 1) {
            answer = (list.first() + list[i]) / 2
        } else {
            answer = (answer + list[i]) / 2
        }
    }

    bw.write(String.format("%.6f", answer))

    bw.flush()
    bw.close()
    close()
}