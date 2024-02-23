import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (p, g) = readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Double>()
    repeat(p) {
        val (kind, num) = readLine().split(" ")
        map[kind] = num.toDouble()
    }

    for (i in 1..g) {
        val command = readLine().split(" ").filterNot { it == "+" }
        val result = command.last().toDouble()
        val comparison = command[command.size - 2]
        var sum = 0.0
        var isCorrect = true
        for (j in 0 until command.size - 2) {
            sum += map[command[j]] ?: 0.0
        }
        when(comparison) {
            "<" -> isCorrect = sum < result

            ">" -> isCorrect = sum > result

            ">=" -> isCorrect = sum >= result

            "<=" -> isCorrect = sum <= result

            "=" -> isCorrect = sum == result
        }
        bw.write("Guess #$i was ${if(isCorrect) "correct" else "incorrect"}.\n")
    }

    bw.flush()
    bw.close()
    close()
}