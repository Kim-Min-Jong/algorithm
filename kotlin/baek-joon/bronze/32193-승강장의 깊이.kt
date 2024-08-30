import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var landing = 0
    var elevator = 0

    repeat(n) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        landing += a
        elevator += b

        bw.write("${landing - elevator}\n")
    }

    bw.flush()
    bw.close()
    close()
}