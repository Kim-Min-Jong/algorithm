import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toLong() * 2 }

    var lcm = lcm(list[0], list[1])

    for (i in 2 until list.size) {
        lcm = lcm(lcm, list[i])
    }

    bw.write("$lcm")

    bw.flush()
    bw.close()
    close()
}
fun gcd(n: Long, m: Long): Long {
    return if (n < m) {
        if (n == 0L) m else gcd(n, m % n)
    } else {
        if (m == 0L) n else gcd(m, n % m)
    }
}

fun lcm(n: Long, m: Long): Long {
    return (n * m) / gcd(n, m)
}