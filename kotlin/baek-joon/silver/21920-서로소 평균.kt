import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val x = readLine().toInt()

    val avgList = mutableListOf<Int>()

    list.forEach {
        if (gcd(it, x) == 1) {
            avgList.add(it)
        }
    }

    bw.write("${avgList.average()}")

    bw.flush()
    bw.close()
    close()
}

fun gcd(n: Int, m: Int): Int {
    return if (n < m) {
        if (n == 0) m else gcd(n, m % n)
    } else {
        if (m == 0) n else gcd(m, n % m)
    }
}