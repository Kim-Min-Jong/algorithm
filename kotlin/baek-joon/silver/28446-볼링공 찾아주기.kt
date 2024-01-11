import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.collections.HashMap

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = hashMapOf<Int, Int>()
    repeat(n) {
        val input = readLine().split(" ")
        when(input[0]) {
            "1" -> {
                map[input[2].toInt()] = input[1].toInt()
            }
            "2" -> {
               bw.write("${map[input[1].toInt()]}\n")
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}