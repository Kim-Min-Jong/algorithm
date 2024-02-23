import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine()
    val t = readLine()
    val lcm = lcm(s.length, t.length)
    val sBuilder = StringBuilder()
    val tBuilder = StringBuilder()

    repeat((lcm/s.length)) {
        sBuilder.append(s)
    }
    repeat((lcm/t.length)) {
        tBuilder.append(t)
    }
    if (sBuilder.toString() == tBuilder.toString()) {
       bw.write("1")
    } else {
        bw.write("0")
    }

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

fun lcm(n: Int, m: Int): Int {
    return (n * m) / gcd(n, m)
}