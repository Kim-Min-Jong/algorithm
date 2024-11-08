import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val (a, b) = readLine().split(" ")
        val sortedA = a.toList().sorted().joinToString("")
        val sortedB = b.toList().sorted().joinToString("")

        if (sortedA == sortedB) {
            bw.write("$a & $b are anagrams.\n")
        } else {
            bw.write("$a & $b are NOT anagrams.\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
