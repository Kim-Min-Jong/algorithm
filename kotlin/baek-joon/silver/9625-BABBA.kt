import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dpA = IntArray(n+3){0}
    val dpB = IntArray(n+3){0}

    dpA[0] = 1
    dpA[1] = 0
    dpA[2] = 1
    dpB[1] = 1
    dpB[2] = 1

    for(i in 3..n) {
        dpA[i] = dpA[i - 1] + dpA[i - 2]
        dpB[i] = dpB[i - 1] + dpB[i - 2]
    }
    bw.write("${dpA[n]} ${dpB[n]}")

    bw.flush()
    bw.close()
    close()
}
