import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = BigInteger(readLine())

    var start = BigInteger.ONE
    var end = n
    var mid = BigInteger.ONE
    while (true) {
        mid = start.add(end).divide(BigInteger("2"))
        val res = mid.multiply(mid).compareTo(n)
        when(res) {
            -1 -> start = mid.add(BigInteger.ONE)
            0 -> break
            1 -> end = mid.subtract(BigInteger.ONE)
        }
    }

    bw.write("$mid")
    
    bw.flush()
    bw.close()
    close()
}