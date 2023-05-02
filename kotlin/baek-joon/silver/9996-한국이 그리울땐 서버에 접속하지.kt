import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val str = readLine().split("*")
    val prefix = str.first()
    val suffix = str.last()
    val regex ="^${prefix}[a-z]*${suffix}$".toRegex()
    repeat(n) {
        val tc = readLine()
        if(regex.matches(tc)) {
            bw.write("DA\n")
        } else bw.write("NE\n")
    }

    bw.flush()
    bw.close()
    close()
}