import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val wow = readLine()
        var cnt = 0
        for (i in 0 until wow.length - 2) {
            if (wow[i] == 'W' && wow[i + 1] == 'O' && wow[i + 2] == 'W') {
                cnt++
            }
        }
        bw.write("${cnt}\n")
    }

    bw.flush()
    bw.close()
    close()
}