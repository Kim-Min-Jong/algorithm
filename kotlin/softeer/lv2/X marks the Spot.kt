import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import kotlin.text.*
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main(args: Array<String>)  = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sb = StringBuilder()
    repeat(n) {
        val (s, t) = readLine().split(" ")
        val index = s.indexOfFirst { it == 'x' || it == 'X' }
        sb.append(t[index])
    }
    sb.toString().forEach {
        when {
            it.isLowerCase() -> {
                  bw.write((it - 32).toString())
            }
            else -> bw.write(it.toString())
        }
    }
    bw.flush()
    bw.close()
    close()

}