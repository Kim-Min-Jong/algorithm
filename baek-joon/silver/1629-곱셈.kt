import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, c) = readLine().split(" ").map{it.toLong()}

    bw.write("${pow(a, b, c)}")

    bw.flush()
    bw.close()
    close()
}

fun pow(a: Long, b: Long, c: Long): Long {
    if(b == 1L) {
        return a % c
    }
    val tmp = pow(a, b / 2, c)

    if(b % 2 == 1L) {
        return ((tmp * tmp % c) * a) % c
    }
    return (tmp * tmp) % c

}
