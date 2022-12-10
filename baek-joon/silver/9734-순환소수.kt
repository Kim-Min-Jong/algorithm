import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val str = readLine()
        if(str == "") break
        val denominator = StringBuilder()

        var (integer, decimal) = str.split(".")
        var decimalList = decimal.removeSuffix(")").split("(")

        val sub1 = decimalList.joinToString("").toInt()

        val sub2 = if(decimalList[0] == "") 0 else decimalList[0].toInt()
        val numerator =  sub1 - sub2

        for(i in 0 until decimalList[1].length) {
            denominator.append("9")
        }
        for(i in 0 until decimalList[0].length) {
            denominator.append("0")
        }

        val denominatorToInt = denominator.toString().toInt()
        val gcd = gcd(numerator, denominatorToInt)
        bw.write("$str = ${ integer.toInt() * (denominatorToInt / gcd) + (numerator / gcd)} / ${denominatorToInt / gcd}\n")

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