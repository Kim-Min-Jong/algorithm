import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigInteger

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map{it.toInt()}
    bw.write("${(factorial(n)/(factorial(k)*factorial(n-k)))%BigInteger("1000000007")}")
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
// 90점을 맞았는데, 큰 수 계산 대한 시간초과 문제가 발생했다.  
// 90점까지는 BigInteger로 해결되는데, 나머지를 해결하려면 다른 알고리즘을 통해 해결해보아야겠다.