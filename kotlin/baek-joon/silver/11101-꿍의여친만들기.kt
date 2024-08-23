import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val map = readLine().split(",").map {
            val (kind, score) = it.split(":")
            kind to score.toInt()
        }.toMap()
        var min = Int.MAX_VALUE
        val command = readLine().split("|")
        command.forEach {
            var max = Int.MIN_VALUE
            val subCommand = it.split("&")
            subCommand.forEach { sub ->
                max = max(max, map[sub]!!)
            }
            min = min(max, min)
        }
        bw.write("$min\n")
    }

    bw.flush()
    bw.close()
    close()
}