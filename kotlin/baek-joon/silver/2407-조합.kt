import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val (n, m) = readLine().split(" ").map{it.toBigInteger()}
    val one = 1.toBigInteger()
    bw.write("${factorial(n, one) / (factorial(m, one) * factorial(n-m, one))}")

    bw.flush()
    bw.close()
    close()
}
tailrec fun factorial(n: BigInteger, acc: BigInteger): BigInteger {
    return if (n <= 0.toBigInteger()) {
        acc
    } else {
        factorial(n-1.toBigInteger(), n*acc)
    }
}  