import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val regex = "^[A-F]?A+F+C+[A-F]?$".toRegex()
    repeat(n) {
        val tc = readLine()
        if(regex.matches(tc)) {
            bw.write("Infected!\n")
        } else bw.write("Good\n")
    }

    bw.flush()
    bw.close()
    close()
}