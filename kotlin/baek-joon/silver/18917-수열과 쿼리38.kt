import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var sum = 0L
    var xorValue = 0L
    repeat(n) {
        val command = readLine().split(" ").map { it.toLong() }
        when(command[0].toInt()) {
            1 -> {
                sum += command[1]
                xorValue = xorValue xor command[1]
            }
            2 -> {
                sum -= command[1]
                xorValue = xorValue xor command[1]
            }
            3 -> bw.write("$sum\n")
            4 -> {
                bw.write("$xorValue\n")
            }
        }
    }
    bw.flush()
    bw.close()
    close()
}
