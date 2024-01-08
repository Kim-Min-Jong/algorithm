import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(" ")

    bw.write("${setMin(a) + setMin(b)} ${setMax(a) + setMax(b)}")

    bw.flush()
    bw.close()
    close()
}
fun setMin(str: String): Int = if ('6' in str)
        str.replace('6', '5').toInt()
    else
        str.toInt()

fun setMax(str: String): Int = if ('5' in str)
        str.replace('5', '6').toInt()
    else
        str.toInt()