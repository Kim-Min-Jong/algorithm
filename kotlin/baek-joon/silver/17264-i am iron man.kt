import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, p) = readLine().split(" ").map { it.toInt() }
    val (w, l, g) = readLine().split(" ").map { it.toInt() }
    var score = 0
    val map = hashMapOf<String, String>()
    var isEscape = false

    repeat(p) {
        val (name, wl) = readLine().split(" ")
        map[name] = wl
    }

    repeat(n) {
        if (score >= g) {
            isEscape = true
            return@repeat
        }

        val name = readLine()

        when(map[name]) {
            "W" -> score += w
            "L", null -> {
                score -= l
                if (score <= 0) score = 0
            }
        }
    }

    bw.write(if (isEscape) "I AM NOT IRONMAN!!" else "I AM IRONMAN!!")

    bw.flush()
    bw.close()
    close()
}