import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var (n, m) = readLine().split(" ").map { it.toInt() }
    val packagePrice = mutableListOf<Int>()
    val eachPrice = mutableListOf<Int>()
    var result = 0
    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        packagePrice.add(a)
        eachPrice.add(b)
    }

    var packageMinPrice = packagePrice.min()
    var eachMinSumPrice = 0

    while (n > 0) {
        when {
            n >= 6 -> {
                eachMinSumPrice = eachPrice.min() * 6
                n -= 6
            }
            else -> {
                eachMinSumPrice = eachPrice.min() * n
                n = 0
            }
        }
        result += when {
            eachMinSumPrice < packageMinPrice -> {
                eachMinSumPrice
            }

            else -> packageMinPrice
        }
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    close()
}