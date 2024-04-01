import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val array = Array(n)  { CharArray(m) }
    val isEscapable = BooleanArray(m) { false }

    for (i in 0 until n) {
        val input = readLine().toCharArray()
        for (j in input.indices) {
            array[i][j] = input[j]
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (array[i][j] == 'O') {
                isEscapable[j] = true
            }
        }
    }

    bw.write(if (isEscapable.contains(false)) "${isEscapable.indexOf(false) + 1}" else "ESCAPE FAILED")

    bw.flush()
    bw.close()
    close()
}