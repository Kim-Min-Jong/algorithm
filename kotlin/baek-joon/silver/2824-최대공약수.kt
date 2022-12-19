import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import java.math.BigInteger
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list1 = readLine().split(" ").map{it.toBigInteger()}
    val m = readLine().toInt()
    val list2 = readLine().split(" ").map{it.toBigInteger()}
    var mul1 = BigInteger("1")
    var mul2 = BigInteger("1")
    for(i in list1) {
        mul1 *= i
    }
    for(i in list2) {
        mul2 *= i
    }

    val gcd = gcd(mul1, mul2).toString()
    when{
        gcd.length > 9 -> {
            bw.write(gcd.takeLast(9))
        }
        else -> {
            bw.write(gcd)
        }
    }

    bw.flush()
    bw.close()
    close()
}
fun lcm(n: BigInteger, m: BigInteger) = (n * m) / gcd(n, m)
fun gcd(n: BigInteger, m: BigInteger): BigInteger {
    return if (n < m) {
        if (n == BigInteger("0")) m else gcd(n, m % n)
    } else {
        if (m == BigInteger("0")) n else gcd(m, n % m)
    }
}