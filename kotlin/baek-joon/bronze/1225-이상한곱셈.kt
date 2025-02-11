import java.io.BufferedWriter
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(" ")
    val aList = a.map { it.digitToInt() }
    val bList = b.map { it.digitToInt() }

    var sum = 0L

    aList.forEach { a1 ->
        bList.forEach { b1 ->
            sum += a1 * b1
        }
    }

    bw.write("$sum")

    closeBW()
    close()
}