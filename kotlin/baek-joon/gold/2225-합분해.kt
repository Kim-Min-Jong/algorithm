import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigInteger

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    // n H r 중복조합 공식
    val (n, r) = readLine().split(" ").map{it.toInt()}

    bw.write("${(factorial(r+n-1)/(factorial(n)*factorial(r-1))) % BigInteger("1000000000")}")

    bw.flush()
    bw.close()
    close()
}
fun factorial(n: Int):BigInteger {
    var sum = BigInteger("1")
    for(i in 1..n) {
        sum *= i.toBigInteger()
    }
    return sum
}