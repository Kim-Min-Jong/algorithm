import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.sqrt
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()
    val fliped = flipNumericString(n)?.reversed()
    if(fliped == null){
        bw.write("no")
    } else{
        if(isPrime(fliped.toLong()) && isPrime(n.toLong())){
            bw.write("yes")
        } else{
            bw.write("no")
        }
    }

    bw.flush()
    bw.close()
    close()
}
fun flipNumericString(str: String): String? {
    val sb = StringBuilder()
    str.forEach {
        when(it) {
            '0', '1', '2', '5', '8' -> {
                sb.append(it)
            }
            '6' -> {
                sb.append('9')
            }
            '9' -> {
                sb.append('6')
            }
            else -> return null
        }
    }
    return sb.toString()
}
fun isPrime(x: Long): Boolean {
    val sqrt = sqrt(x.toDouble()).toLong()
    if (x == 0L || x == 1L)
        return false
    for (i in 2 until sqrt + 1) {
        if (x % i == 0L)
            return false
    }
    return true
}