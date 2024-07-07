import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()

    listOf(2, 3, 5, 7).forEach {
        dfs_2023(it, n.toInt())
    }

    bw.flush()
    bw.close()
    close()
}

fun dfs_2023(num: Int, length: Int) {
    if (num.toString().length == length) {
        bw.write("$num\n")
        return
    }
    for (i in 0..9) {
        val tmpNumber = num * 10 + i
        if (isPrime(tmpNumber))
            dfs_2023(tmpNumber, length)
    }
}

fun isPrime(n: Int): Boolean {
    if (n < 2)
        return false
    for (i in 2 until sqrt(n.toDouble()).toInt() + 1) {
        if (n % i == 0)
            return false
    }
    return true
}