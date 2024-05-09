import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        val (a, b) = readLine().split(" ")
        var isContain = true
        val arr = Array<Int>(26) { 0 }
        for (i in 0 until a.length) {
            arr[a[i] - 'a'] += 1
        }
        for (i in 0 until b.length) {
            arr[b[i] - 'a'] -= 1
        }

        for (i in arr) {
            if (i != 0) {
                isContain = false
                break
            }
        }
        bw.write(if (isContain) "Possible\n" else "Impossible\n")
    }

    bw.flush()
    bw.close()
    close()
}
