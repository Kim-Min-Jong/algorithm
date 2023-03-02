import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toInt()}
    bw.write("${n + m - gcd(n, m)}")
    
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