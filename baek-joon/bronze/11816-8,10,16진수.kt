import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val str = readLine()
    when {
        str[0] == '0' && str[1] != 'x' -> {
            bw.write("${str.slice(1 until str.length).toInt(8)}")
        }
        str[0] == '0' && str[1] == 'x' -> {
            bw.write("${str.slice(2 until str.length).toInt(16)}")
        }
        else -> bw.write("${str.toInt()}")
    }

    bw.flush()
    bw.close()
    close()
}