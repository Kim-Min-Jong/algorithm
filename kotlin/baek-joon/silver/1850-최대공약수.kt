import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toLong()}
    val cnt = gcd(n, m)
    val sb = StringBuilder()
    repeat(cnt.toInt()) {
        sb.append("1")
    }
    bw.write("$sb")

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