import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()

    repeat(n) {
        val command = readLine().split(" ").map { it.toInt() }
        when (command[0]) {
            1 -> {
                when (command[1]) {
                    1 -> list.sort()
                    2 -> list.sortDescending()
                }
            }

            2 -> {
                if (command[1] == 0) {
                    list.add(0, command[2])
                } else if (command[1] != 0 && abs(command[1]) == list.size) {
                    list.add(command[2])
                } else {
                    list.add(command[1], command[2])
                }
            }
        }
    }

    bw.write("${list.size}\n")
    bw.write(list.joinToString(" "))

    closeBW()
    close()
}