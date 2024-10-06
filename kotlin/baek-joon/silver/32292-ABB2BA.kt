import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()

    repeat(tc) {
        val n = readLine().toInt()
        var str = readLine()

        while(str.contains("ABB")) {
            str = str.replace("ABB", "BA")
        }

        bw.write("$str\n")
    }

    bw.flush()
    bw.close()
    close()
}