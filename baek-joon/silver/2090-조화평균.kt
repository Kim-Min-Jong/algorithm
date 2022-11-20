import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toLong()}
    var lcm = list[0]
    var res = 0L
    for(i in 1 until list.size) {
        lcm = lcm(lcm, list[i])
    }
    list.forEach {
        res += lcm / it
    }

    val gcd = gcd(res, lcm)

    bw.write("${lcm/gcd}/${res/gcd}")

    bw.flush()
    bw.close()
    close()
}
fun lcm(n: Long, m: Long) = (n * m) / gcd(n, m)
fun gcd(n: Long, m: Long): Long {
    return if (n < m) {
        if (n == 0L) m else gcd(n, m % n)
    } else {
        if (m == 0L) n else gcd(m, n % m)
    }
}